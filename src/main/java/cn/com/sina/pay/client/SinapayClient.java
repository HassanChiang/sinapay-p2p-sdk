package cn.com.sina.pay.client;

import cn.com.sina.pay.data.constant.SinapayServiceNameEnum;
import cn.com.sina.pay.data.request.SinapayRequestData;
import cn.com.sina.pay.data.response.SinapayResponseData;

/**
 * 新浪支付链接客户端
 * @author hassan.chiang@gmail.com
 * @date 2016年4月18日 下午5:09:45
 */
public interface SinapayClient {
    /**
     * 服务器端直接请求
     * @param service
     * @param requestData
     * @return
     */
    SinapayResponseData directRequest(SinapayServiceNameEnum service, SinapayRequestData requestData);
    
    /**
     * 生成PostForm代码（Html代码）
     * @param service
     * @param requestData
     * @return
     */
    String generatePostFrom(SinapayServiceNameEnum service, SinapayRequestData requestData);
}
