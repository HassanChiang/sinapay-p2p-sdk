package cn.com.sina.pay.data.response;

/**
 * 查托管退款的响应
 * @author hassan.chiang@gmail.com
 *
 */
public class CreateHostingRefundResponseData extends SinapayResponseData {
	
	/**
	 * 交易订单号
	 * name:out_trade_no
	 */
	private String outTradeNo;
	
	/**
	 * 退款状态
	 * name:refund_status
	 */
	private String refundStatus;

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getRefundStatus() {
		return refundStatus;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	
}
