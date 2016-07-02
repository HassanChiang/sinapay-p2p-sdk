package cn.com.sina.pay.data.request;

/**
 * 冻结余额的请求
 * @author hassan.chiang@gmail.com
 *
 */
public class BalanceFreezeRequestData extends SinapayRequestData {
	
	/**
	 * 原冻结订单号
	 * name:out_freeze_no
	 */
	private String outFreezeNo;
	
	/**
	 * 用户标识信息
	 * name:identity_id
	 */
	private String identityId;
	
	/**
	 * 用户标识类型
	 * name:identity_type
	 */
	private String identityType = "UID"; 
	
	/**
	 * 账户类型
	 * name:account_type
	 */
	private String accountType;
	
	/**
	 * 金额
	 * name:amount
	 */
	private String amount ;
	
	/**
	 * 摘要
	 * name:summary
	 */
	private String summary;
	
	public String getOutFreezeNo() {
		return outFreezeNo;
	}

	public void setOutFreezeNo(String outFreezeNo) {
		this.outFreezeNo = outFreezeNo;
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

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
	
}
