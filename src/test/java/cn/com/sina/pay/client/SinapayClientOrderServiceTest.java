package cn.com.sina.pay.client;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import cn.com.sina.pay.data.BankPayTypeData;
import cn.com.sina.pay.data.bank.BankCardTypeEnum;
import cn.com.sina.pay.data.bank.BankCodeEnum;
import cn.com.sina.pay.data.bank.BankCardPropertiesEnum;
import cn.com.sina.pay.data.constant.SinapayServiceNameEnum;
import cn.com.sina.pay.data.request.CreateHostingDepositRequestData;

public class SinapayClientOrderServiceTest {
    private final int BASIC_PARAMS_COUNT = 11;
    
    /**
     * 充值
     */
    @Test
    public void testCREATE_HOSTING_DEPOSIT(){
        SinapayClient client = SinapayClientFactory.getSinapayHttpClient();
        CreateHostingDepositRequestData req = new CreateHostingDepositRequestData();
        //----以下为业务参数
        req.setOutTradeNo("2016042013080001");
        req.setSummary("账户充值");
        req.setIdentityId("test001");
        req.setIdentityType("UID");
        req.setAmount("200.00");
        req.setPayMethod(new BankPayTypeData(
                BankCodeEnum.BCCB, 
                BankCardTypeEnum.DEBIT, 
                BankCardPropertiesEnum.C, 
                Double.valueOf(req.getAmount())).toString()); 
        String form = client.generatePostFrom(SinapayServiceNameEnum.CREATE_HOSTING_DEPOSIT, req);
        Document d = Jsoup.parse(form);
        Elements formElements = d.select("form");
        Assert.assertEquals(SinapayServiceNameEnum.CREATE_HOSTING_DEPOSIT.getRequestUrl(),formElements.attr("action"));
        Elements inputElements = d.select("input");
        Assert.assertEquals(inputElements.size(),  BASIC_PARAMS_COUNT + 6);//6是业务参数的数量
        System.out.println(form);
    }
}
