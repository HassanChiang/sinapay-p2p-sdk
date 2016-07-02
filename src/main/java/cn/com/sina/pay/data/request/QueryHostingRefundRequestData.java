package cn.com.sina.pay.data.request;

/**
 * 托管退款查询的请求
 * @author hassan.chiang@gmail.com
 *
 */
public class QueryHostingRefundRequestData extends SinapayRequestData {
	
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
	 * 退款订单号
	 * name:out_trade_no
	 */
	private String outTradeNo;
	
	/**
	 * 开始时间
	 * name:start_time
	 */
	private String startTime;
	
	/**
	 * 结束时间
	 * name:end_time
	 */
	private String endTime;
	
	/**
	 * 页号
	 * name:page_no
	 */
	private String pageNo;
	
	/**
	 * 每页大小
	 * name:page_size
	 */
	private String pageSize;

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

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getPageNo() {
		return pageNo;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public String getPageSize() {
		return pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

}
