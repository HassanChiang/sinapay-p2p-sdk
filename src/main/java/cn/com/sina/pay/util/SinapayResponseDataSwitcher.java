package cn.com.sina.pay.util;

import cn.com.sina.pay.data.constant.SinapayServiceNameEnum;
import cn.com.sina.pay.data.response.BalanceFreezeResponseData;
import cn.com.sina.pay.data.request.BindingBankCardRequestData;
import cn.com.sina.pay.data.response.BandingBankCardResponseData;
import cn.com.sina.pay.data.response.CreateActivateMemberResponseData;
import cn.com.sina.pay.data.response.CreateHostingDepositResponseData;
import cn.com.sina.pay.data.response.CreateHostingWithDrawResponseData;
import cn.com.sina.pay.data.response.QueryAuditResultResponseData;
import cn.com.sina.pay.data.response.QueryHostingRefundResponseData;
import cn.com.sina.pay.data.response.QueryVerifyResponseData;
import cn.com.sina.pay.data.response.SetRealNameResponseData;
import cn.com.sina.pay.data.response.SinapayResponseData;

/**
 * 通过服务名，选择响应对象类类型
 * @author hassan.chiang@gmail.com
 * @date 2016年4月19日 下午6:25:27
 */
public class SinapayResponseDataSwitcher {
    public static Class<? extends SinapayResponseData> getClassByService(SinapayServiceNameEnum service){
        switch (service) {
        case CREATE_ACTIVATE_MEMBER:
            return CreateActivateMemberResponseData.class;
        case BALANCE_FREEZE:
        	return BalanceFreezeResponseData.class;
        case BALANCE_UNFREEZE:
        	return BalanceFreezeResponseData.class;
        case QUERY_AUDIT_RESULT:
        	return QueryAuditResultResponseData.class;
        case CREATE_HOSTING_REFUND:
        	return CreateHostingDepositResponseData.class;
        case SET_REAL_NAME:
        	return SetRealNameResponseData.class;
        case QUERY_VERIFY:
        	return QueryVerifyResponseData.class;
        case BINDING_BANK_CARD:
        	return BandingBankCardResponseData.class;
        case CREATE_HOSTING_WITHDRAW:
        	return CreateHostingWithDrawResponseData.class;
        case QUERY_HOSTING_REFUND:
        	return QueryHostingRefundResponseData.class;
        default:
            return null;
        }
    }
}
