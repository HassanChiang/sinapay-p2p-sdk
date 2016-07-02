package cn.com.sina.pay.data.request;

/**
 * 提现请求
 * @author hassan.chiang@gmail.com
 */
public class CreateHostingWithdrawRequestData extends SinapayRequestData {
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
     * 银行卡ID
     * name: card_id   
     */
    private String cardId;
    /**
     * 提现方式
     * name:withdraw_mode
     */
    private String withdrawMode;
   
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

	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getWithdrawMode() {
		return withdrawMode;
	}
	public void setWithdrawMode(String withdrawMode) {
		this.withdrawMode = withdrawMode;
	}
}
