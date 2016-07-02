package cn.com.sina.pay.client;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.com.sina.pay.data.constant.SinapayServiceNameEnum;
import cn.com.sina.pay.data.constant.SinapayProperties;
import cn.com.sina.pay.data.request.SinapayRequestData;
import cn.com.sina.pay.data.response.SinapayResponseData;
import cn.com.sina.pay.util.SinapayRequestParamsUtil;
import cn.com.sina.pay.util.SinapayResponseDataParser;
import cn.com.sina.pay.util.SinapaySignUtil;
import cn.com.sina.pay.util.SinapayResponseDataSwitcher;
import cn.com.sina.pay.util.SinapayDateUtil;

public class SinapayHttpClient implements SinapayClient {
    final Logger logger = LoggerFactory.getLogger(SinapayHttpClient.class);
    private static CloseableHttpClient httpclient;
    private static ResponseHandler<String> responseHandler;
    
    static {
        httpclient = HttpClients.createDefault();
        responseHandler = new ResponseHandler<String>() {
            public String handleResponse(HttpResponse response)
                    throws ClientProtocolException, IOException {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 300) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    throw new ClientProtocolException("Unexpected response status: " + status);
                }
            }
        };
    }
    
    public SinapayResponseData directRequest(SinapayServiceNameEnum service, SinapayRequestData requestData) {
        SinapayResponseData sinaPayResponseData = new SinapayResponseData();
        String url = service.getRequestUrl();
        if(StringUtils.isBlank(url)){
            sinaPayResponseData.setResponseMessage("请求url为空！");
            logger.info("新浪支付请求：service={},url is null !", service.getName());
            return sinaPayResponseData;
        }
        prepareRequestData(service, requestData);
        
        String queryString = SinapayRequestParamsUtil.generateRequestParamsString(requestData);
        String questionSymbol = (url.indexOf("?") == -1 ? "?" : ""); 
        url = url + questionSymbol + queryString;
        HttpGet httpget = new HttpGet(url);
        String logTimestamp = new Date().getTime() + "";
        logger.info("logTimestamp={},发起新浪支付平台Get请求：url={}", logTimestamp, url);
        try {
            String responseBody = httpclient.execute(httpget, responseHandler);
            responseBody = URLDecoder.decode(responseBody, "UTF-8");
            logger.info("logTimestamp={},收到新浪支付平台Get响应：response={}", logTimestamp, responseBody);
            Class<? extends SinapayResponseData> clazz = SinapayResponseDataSwitcher.getClassByService(service);
            sinaPayResponseData = SinapayResponseDataParser.parseStringToSinaPayResponseData(responseBody, clazz);
            boolean flag = SinapaySignUtil.checkSign(sinaPayResponseData);
            if(!flag){
                sinaPayResponseData = new SinapayResponseData();
                sinaPayResponseData.setResponseMessage("响应验签失败！");
                logger.info("logTimestamp={},响应验签失败！", logTimestamp);
            }
            return sinaPayResponseData;
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void prepareRequestData(SinapayServiceNameEnum service, SinapayRequestData requestData) {
        //设置服务名称
        requestData.setService(service.getName());
        requestData.setPartnerId(SinapayProperties.getPartnerId());
        requestData.setRequestTime(SinapayDateUtil.getNowString());
        String notifyUrl = SinapayProperties.getNotifyUrl();
        String returnUrl = SinapayProperties.getReturnUrl();
        String notifyUrlEndChar = notifyUrl.endsWith("/") ? "":"/";
        String returnUrlEndChar = returnUrl.endsWith("/") ? "":"/";
        requestData.setNotifyUrl(notifyUrl + notifyUrlEndChar + service.getName());
        requestData.setReturnUrl(returnUrl + returnUrlEndChar + service.getName());
        //数据补充完毕后才可以开始设置签名
        String signSource = SinapaySignUtil.generateSignSourceString(requestData);
        requestData.setSign(SinapaySignUtil.sign(signSource));
    }

    public String generatePostFrom(SinapayServiceNameEnum service, SinapayRequestData requestData) {
        String url = service.getRequestUrl();
        if(StringUtils.isBlank(url)){
            logger.info("新浪支付请求：service={},url is null !", service.getName());
            return "";
        }
        prepareRequestData(service, requestData);
        String form = SinapayRequestParamsUtil.generateFormHtmlFragment(requestData, url);
        return form;
    }
}
