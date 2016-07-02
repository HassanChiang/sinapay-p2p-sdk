package cn.com.sina.pay.data.response;

/**
 * 提现响应
 * @author hassan.chiang@gmail.com
 */
public class CreateHostingWithDrawResponseData extends SinapayResponseData {
    /**
     * 提现订单号
     * name:out_trade_no
     */
    private String outTradeNo;
    /**
     * 提现状态
     * name:withdraw_status
     */
    private String withdrawStatus;

    
    public String getOutTradeNo() {
        return outTradeNo;
    }
    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

	public String getWithdrawStatus() {
		return withdrawStatus;
	}
	public void setWithdrawStatus(String withdrawStatus) {
		this.withdrawStatus = withdrawStatus;
	}
}
