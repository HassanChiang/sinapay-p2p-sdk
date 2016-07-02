package cn.com.sina.pay.data.response;

public class QueryVerifyResponseData extends SinapayResponseData{
	/**
     * 认证内容
     * name:verify_entity
     */
    private String verifEntity;
    /**
     * 认证时间
     * name:verify_time
     */
    private String verifyTime;
	
    public String getVerifEntity() {
		return verifEntity;
	}
	public void setVerifEntity(String verifEntity) {
		this.verifEntity = verifEntity;
	}
	
	public String getVerifyTime() {
		return verifyTime;
	}
	public void setVerifyTime(String verifyTime) {
		this.verifyTime = verifyTime;
	}

	

}
