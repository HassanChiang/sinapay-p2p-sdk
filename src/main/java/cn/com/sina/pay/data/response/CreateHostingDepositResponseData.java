package cn.com.sina.pay.data.response;

/**
 * 充值响应
 * @author hassan.chiang@gmail.com
 * @date 2016年4月20日 下午1:03:53
 */
public class CreateHostingDepositResponseData extends SinapayResponseData {
    /**
     * 充值订单号
     * name:out_trade_no
     */
    private String outTradeNo;
    /**
     * 充值状态
     * name:deposit_status
     */
    private String depositStatus;
    /**
     * 后续推进需要的参数
     * name:ticket
     */
    private String ticket;
    
    public String getOutTradeNo() {
        return outTradeNo;
    }
    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }
    public String getDepositStatus() {
        return depositStatus;
    }
    public void setDepositStatus(String depositStatus) {
        this.depositStatus = depositStatus;
    }
    public String getTicket() {
        return ticket;
    }
    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
}
