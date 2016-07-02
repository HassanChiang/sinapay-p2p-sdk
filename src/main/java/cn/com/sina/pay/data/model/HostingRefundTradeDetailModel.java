package cn.com.sina.pay.data.model;

/**
 * 退款交易条目明细
 * @author hassan.chiang@gmail.com
 *
 */
public class HostingRefundTradeDetailModel {
	
	/**
	 * 交易订单号
	 * name:out_trade_no
	 */
	private String aOutTradeNo;
	
	/**
	 * 摘要
	 * name:summary
	 */
	private String bSummary;
	
	/**
	 * 交易金额
	 * name:tread_amount
	 */
	private String cTreadAmount;
	
	/**
	 * 状态
	 * name:tread_status
	 */
	private String dTreadStatus;
	
	/**
	 * 创建时间
	 * name:create_time
	 */
	private String eCreateTime;
	
	/**
	 * 最后修改时间
	 * name:update_time
	 */
	private String fUpdateTime;

    public String getaOutTradeNo() {
        return aOutTradeNo;
    }

    public void setaOutTradeNo(String aOutTradeNo) {
        this.aOutTradeNo = aOutTradeNo;
    }

    public String getbSummary() {
        return bSummary;
    }

    public void setbSummary(String bSummary) {
        this.bSummary = bSummary;
    }

    public String getcTreadAmount() {
        return cTreadAmount;
    }

    public void setcTreadAmount(String cTreadAmount) {
        this.cTreadAmount = cTreadAmount;
    }

    public String getdTreadStatus() {
        return dTreadStatus;
    }

    public void setdTreadStatus(String dTreadStatus) {
        this.dTreadStatus = dTreadStatus;
    }

    public String geteCreateTime() {
        return eCreateTime;
    }

    public void seteCreateTime(String eCreateTime) {
        this.eCreateTime = eCreateTime;
    }

    public String getfUpdateTime() {
        return fUpdateTime;
    }

    public void setfUpdateTime(String fUpdateTime) {
        this.fUpdateTime = fUpdateTime;
    }
}
