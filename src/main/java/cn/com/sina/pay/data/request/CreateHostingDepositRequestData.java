package cn.com.sina.pay.data.request;

/**
 * 充值请求
 * @author hassan.chiang@gmail.com
 * @date 2016年4月20日 下午12:56:27
 */
public class CreateHostingDepositRequestData extends SinapayRequestData {
    /**
     * 交易订单号
     * name:out_trade_no
     */
    private String outTradeNo;
    /**
     * 摘要   
     * name:summary
     */
    private String summary;
    /**
     * 用户标识信息  
     * name:identity_id
     */
    private String identityId;
    /**
     * 用户标识类型
     * name:identity_type   
     */
    private String identityType;
    /**
     * 账户类型
     * name:account_type    
     */
    private String accountType;
    /**
     * 金额
     * name:amount  
     */
    private String amount;
    /**
     * 用户手续费
     * name:user_fee   
     */
    private String userFee ;
    /**
     * 付款用户IP地址
     * name:payer_ip    
     */
    private String payerIp;
    /**
     * 支付方式
     * name:pay_method  
     */
    private String payMethod;
    public String getOutTradeNo() {
        return outTradeNo;
    }
    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }
    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
    public String getIdentityId() {
        return identityId;
    }
    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }
    public String getIdentityType() {
        return identityType;
    }
    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }
    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public String getAmount() {
        return amount;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }
    public String getUserFee() {
        return userFee;
    }
    public void setUserFee(String userFee) {
        this.userFee = userFee;
    }
    public String getPayerIp() {
        return payerIp;
    }
    public void setPayerIp(String payerIp) {
        this.payerIp = payerIp;
    }
    public String getPayMethod() {
        return payMethod;
    }
    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }
}
