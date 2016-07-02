package cn.com.sina.pay.data.request;

public class QueryVerifyRequestData extends SinapayRequestData{
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
     * 认证类型
     * name:verify_type
     */
    private String verifyType;
    /**
     * 是否掩码
     * name:is_mask
     */
    private String isMask;
	
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
	
	public String getVerifyType() {
		return verifyType;
	}
	public void setVerifyType(String verifyType) {
		this.verifyType = verifyType;
	}
	
	public String getIsMask() {
		return isMask;
	}
	public void setIsMask(String isMask) {
		this.isMask = isMask;
	}
}
