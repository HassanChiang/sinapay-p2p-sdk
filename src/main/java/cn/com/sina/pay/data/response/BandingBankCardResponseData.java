package cn.com.sina.pay.data.response;

public class BandingBankCardResponseData extends SinapayResponseData{
	/**
     * 卡ID
     * name:card_id
     */
    private String cardId;
    /**
     * 用户标识类型
     * name:is_verified
     */
    private String isVerified;
    /**
     * 绑卡请求号
     * name:ticket
     */
    private String ticket;
	
    public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	
	public String getIsVerified() {
		return isVerified;
	}
	public void setIsVerified(String isVerified) {
		this.isVerified = isVerified;
	}
	
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
}
