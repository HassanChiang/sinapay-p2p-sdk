package cn.com.sina.pay.data.request;

/**
 * 解冻余额的请求
 * @author hassan.chiang@gmail.com
 *
 */
public class BalanceUnfreezeRequestData extends SinapayRequestData {
	
	/**
	 * 解冻订单号
	 * name:out_unfreeze_no
	 */
	private String outUnfreezeNo;
	
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
	private String identityType;
	
	/**
	 * 解冻金额
	 * name:amount
	 */
	private String amount;
	
	/**
	 * 摘要
	 * name:summary
	 */
	private String summary;

	public String getOutUnfreezeNo() {
		return outUnfreezeNo;
	}

	public void setOutUnfreezeNo(String outUnfreezeNo) {
		this.outUnfreezeNo = outUnfreezeNo;
	}

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
