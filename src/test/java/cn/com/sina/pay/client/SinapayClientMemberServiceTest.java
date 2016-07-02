package cn.com.sina.pay.client;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import cn.com.sina.pay.data.bank.BankCardTypeEnum;
import cn.com.sina.pay.data.bank.BankCardVerifyMode;
import cn.com.sina.pay.data.bank.BankCodeEnum;
import cn.com.sina.pay.data.constant.SinapayCertType;
import cn.com.sina.pay.data.constant.SinapayResponseCodeEnum;
import cn.com.sina.pay.data.constant.SinapayServiceNameEnum;
import cn.com.sina.pay.data.constant.SinapayVerifyType;
import cn.com.sina.pay.data.request.BalanceFreezeRequestData;
import cn.com.sina.pay.data.request.BalanceUnfreezeRequestData;
import cn.com.sina.pay.data.request.BindingBankCardRequestData;
import cn.com.sina.pay.data.request.CreateActivateMemberRequestData;
import cn.com.sina.pay.data.request.CreateHostingRefundRequestData;
import cn.com.sina.pay.data.request.QueryAuditResultRequestData;
import cn.com.sina.pay.data.request.QueryHostingRefundRequestData;
import cn.com.sina.pay.data.request.QueryVerifyRequestData;
import cn.com.sina.pay.data.request.SetRealNameRequestData;
import cn.com.sina.pay.data.response.SinapayResponseData;

public class SinapayClientMemberServiceTest {
    
    /**
     * 激活用户
     */
    @Test
    public void testCREATE_ACTIVATE_MEMBER(){
        SinapayClient client = SinapayClientFactory.getSinapayHttpClient();
        CreateActivateMemberRequestData req = new CreateActivateMemberRequestData();
        //----以下为业务参数
        req.setIdentityId("test001");
        req.setIdentityType("UID");
        req.setMemberType("1");
        SinapayResponseData resp = client.directRequest(SinapayServiceNameEnum.CREATE_ACTIVATE_MEMBER, req);
        Assert.assertEquals(SinapayResponseCodeEnum.APPLY_SUCCESS.name(),resp.getResponseCode());
        Assert.assertEquals("提交成功",resp.getResponseMessage());
    }
    
    /**
     *设置实名信息
     */
    @Test
    public void testSET_REAL_NAME(){
        SinapayClient client = SinapayClientFactory.getSinapayHttpClient();
        SetRealNameRequestData req = new SetRealNameRequestData();
        req.setIdentityId("test001");
        req.setIdentityType("UID");
        req.setRealName("XAIDFJAASDF");
        req.setCertType(SinapayCertType.IC.name());
        req.setCertNo("XAIDFJAASDF");
        req.setNeedConfirm("Y");
        SinapayResponseData resp = client.directRequest(SinapayServiceNameEnum.SET_REAL_NAME, req);
        Assert.assertEquals(SinapayResponseCodeEnum.ILLEGAL_DECRYPT.name(),resp.getResponseCode());
        Assert.assertEquals("解密失败，请检查加密字段",resp.getResponseMessage());
    }
    
    /**
     *
     */
    @Test
    public void testBINDING_VERIFY(){
        
    }
    
    /**
     * 
     */
    @Test
    public void testUNBINDING_VERIFY(){
        
    }
    
    /**
     * 查询认证信息
     */
    @Test
    public void testQUERY_VERIFY(){
        SinapayClient client = SinapayClientFactory.getSinapayHttpClient();
        QueryVerifyRequestData req = new QueryVerifyRequestData();
        req.setIdentityId("test001");
        req.setIdentityType("UID");
        req.setVerifyType(SinapayVerifyType.MOBILE.name());
        req.setIsMask("Y");
        SinapayResponseData resp = client.directRequest(SinapayServiceNameEnum.QUERY_VERIFY, req);
        Assert.assertEquals(SinapayResponseCodeEnum.VERIFY_NOT_EXIST.name(),resp.getResponseCode());
        Assert.assertEquals("认证信息不存在",resp.getResponseMessage());
         
    }
    
    /**
     * 绑定银行卡
     */
    @Test
    public void testBINDING_BANK_CARD(){
    	SinapayClient client = SinapayClientFactory.getSinapayHttpClient();
    	BindingBankCardRequestData req = new BindingBankCardRequestData();
        req.setIdentityId("test001");
        req.setIdentityType("UID");
        req.setRequestNo("20131105154925");
        req.setBankCode(BankCodeEnum.ABC.name());
        req.setBankAccountNo("XAIDFJAASDF");
        req.setAccountName("XAIDFJAASDF");
        req.setCardType(BankCardTypeEnum.DEBIT.name());
        req.setPhoneNo("XAIDFJAASDF");
        req.setValidityPeriod("XAIDFJAASDF");
        req.setVerificationValue("XAIDFJAASDF");
        req.setProvince("上海市");
        req.setCity("上海市");
        req.setBankBranch("中国农业银行深圳南山支行");
        req.setVerifyMode(BankCardVerifyMode.SIGN.name());
        SinapayResponseData resp = client.directRequest(SinapayServiceNameEnum.QUERY_VERIFY, req);
        Assert.assertEquals(SinapayResponseCodeEnum.ILLEGAL_ARGUMENT.name(),resp.getResponseCode());
        Assert.assertEquals("认证类型不可为空",resp.getResponseMessage());
    }
    
    /**
     * 
     */
    @Test
    public void testBINDING_BANK_CARD_ADVANCE(){
        
    }
    
    /**
     * 
     */
    @Test
    public void testUNBINDING_BANK_CARD(){
        
    }
    
    /**
     * 
     */
    @Test
    public void testQUERY_BANK_CARD(){
        
    }
    
    /**
     * 
     */
    @Test
    public void testQUERY_BALANCE(){
        
    }
    
    /**
     * 
     */
    @Test
    public void testQUERY_ACCOUNT_DETAILS(){
        
    }
    
    /**
     * 冻结余额
     */
    @Test
    public void testBALANCE_FREEZE(){
    	SinapayClient client = SinapayClientFactory.getSinapayHttpClient();
    	BalanceFreezeRequestData req = new BalanceFreezeRequestData();
    	req.setOutFreezeNo("20131105154925");
    	req.setIdentityId("test001");
    	req.setIdentityType("UID");
    	req.setAccountType("BASIC");
    	req.setAmount("10.00");
    	req.setSummary("非法占用");
    	SinapayResponseData resp = client.directRequest(SinapayServiceNameEnum.BALANCE_FREEZE, req);
        Assert.assertEquals(SinapayResponseCodeEnum.NO_BASIC_ACCOUNT.name(),resp.getResponseCode());
        Assert.assertEquals("用户无基本账户信息或没有激活",resp.getResponseMessage());
    }
    
    /**
     * 解冻余额
     */
    @Test
    public void testBALANCE_UNFREEZE(){
    	SinapayClient client = SinapayClientFactory.getSinapayHttpClient();
    	BalanceUnfreezeRequestData req = new BalanceUnfreezeRequestData();
    	req.setOutUnfreezeNo("20131105154925");
    	req.setOutFreezeNo("20131105154925");
    	req.setIdentityId("test001");
    	req.setIdentityType("UID");
    	req.setAmount("10.00");
    	req.setSummary("事件已处理");
    	SinapayResponseData resp = client.directRequest(SinapayServiceNameEnum.BALANCE_UNFREEZE, req);
	    Assert.assertEquals(SinapayResponseCodeEnum.NO_BASIC_ACCOUNT.name(),resp.getResponseCode());
        Assert.assertEquals("用户无基本账户信息或没有激活",resp.getResponseMessage());
    }
    
    /**
     * 
     */
    @Test
    public void testAUDIT_MEMBER_INFOS(){
        
    }
    
    /**
     * 
     */
    @Test
    public void testQUERY_MEMBER_INFOS(){
        
    }
    
    /**
     * 查询企业会员审核结果
     */
    @Test
    public void testQUERY_AUDIT_RESULT(){
    	SinapayClient client = SinapayClientFactory.getSinapayHttpClient();
    	QueryAuditResultRequestData req = new QueryAuditResultRequestData();
    	req.setIdentityId("2000011212");
    	req.setIdentityType("UID");
    	SinapayResponseData resp = client.directRequest(SinapayServiceNameEnum.QUERY_AUDIT_RESULT, req);
    	Assert.assertEquals(SinapayResponseCodeEnum.AUDIT_NOTHING.name(),resp.getResponseCode());
        Assert.assertEquals("无任何审核信息",resp.getResponseMessage());
    }
    
    /**
     * 托管退款
     * @throws Exception
     */
    @Test
	public void testCREATE_HOSTING_REFUND() throws Exception {
    	SinapayClient client = SinapayClientFactory.getSinapayHttpClient();
    	CreateHostingRefundRequestData req = new CreateHostingRefundRequestData();
    	req.setOutTradeNo("20131105154925");
    	req.setOrigOuterTradeNo("2013112405052323");
    	req.setRefundAmount("10.00");
    	req.setSummary("流标退款");
    	SinapayResponseData resp = client.directRequest(SinapayServiceNameEnum.CREATE_HOSTING_REFUND, req);
    	Assert.assertEquals(SinapayResponseCodeEnum.ILLEGAL_SERVICE.name(),resp.getResponseCode());
        Assert.assertEquals("服务接口不存在",resp.getResponseMessage());
	}
    
    /**
     * 托管退款查询
     * @throws Exception
     */
    @Test
	public void testQUERY_HOSTING_REFUND() throws Exception {
    	SinapayClient client = SinapayClientFactory.getSinapayHttpClient();
    	QueryHostingRefundRequestData req = new QueryHostingRefundRequestData();
    	req.setIdentityId("2000011212");
    	req.setIdentityType("UID");
    	req.setOutTradeNo("20131105154925");
    	req.setStartTime("20131117020101");
    	req.setEndTime("20131117020101");
    	req.setPageNo("1");
    	req.setPageSize("20");
    	SinapayResponseData resp = client.directRequest(SinapayServiceNameEnum.QUERY_HOSTING_REFUND, req);
    	Assert.assertEquals(SinapayResponseCodeEnum.AUTHORIZE_FAIL.name(),resp.getResponseCode());
        Assert.assertEquals("会员状态异常",resp.getResponseMessage());
	}
    
    /**
     * 
     */
    @Test
    public void testSHOW_MEMBER_INFOS_SINA(){
        
    }
    
    /**
     * 
     */
    @Test
    public void testQUERY_CTRL_RESULT(){
        
    }
    
    /**
     * 
     */
    @Test
    public void testSMT_FUND_AGENT_BUY(){
        
    }
    
    /**
     * 
     */
    @Test
    public void testQUERY_MIDDLE_ACCOUNT(){
        
    }
    
    /**
     * 
     */
    @Test
    public void testUNBINDING_BANK_CARD_ADVANCE(){
        
    }
    
    @Test
	public void testGetObjectType() throws Exception {
		Object o = 10.00;
		if(o instanceof Double){
			System.out.println(o);
		}
		System.out.println(o.getClass());
	}
}
