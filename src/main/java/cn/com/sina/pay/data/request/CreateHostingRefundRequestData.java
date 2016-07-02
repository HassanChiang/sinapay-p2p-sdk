package cn.com.sina.pay.data.request;

/**
 * 查托管退款的请求
 * @author hassan.chiang@gmail.com
 *
 */
public class CreateHostingRefundRequestData extends SinapayRequestData {
	
	/**
	 * 交易订单号
	 * name:out_trade_no
	 */
	private String outTradeNo;
	
	/**
	 * 需要退款的商户订单号
	 * name:orig_outer_trade_no 
	 */
	private String origOuterTradeNo ;
	
	/**
	 * 退款金额
	 * name:refund_amount
	 */
	private String refundAmount;
	
	/**
	 * 摘要
	 * name:summary
	 */
	private String summary;
	
	/**
	 * 分账信息列表（目前代付不支持退款，因此退款时分账列表都为空）
	 * name:split_list
	 */
	private String splitList;

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getOrigOuterTradeNo() {
		return origOuterTradeNo;
	}

	public void setOrigOuterTradeNo(String origOuterTradeNo) {
		this.origOuterTradeNo = origOuterTradeNo;
	}

	public String getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getSplitList() {
		return splitList;
	}

	public void setSplitList(String splitList) {
		this.splitList = splitList;
	}

}
