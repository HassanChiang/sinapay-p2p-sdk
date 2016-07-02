package cn.com.sina.pay.data.request;

public class SetRealNameRequestData extends SinapayRequestData{

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
     * 真实姓名
     * name:real_name
     */
    private String realName;
    /**
     * 证件类型
     * name:cert_type
     */
    private String certType;
    /**
     * 证件号码
     * name:cert_type
     */
    private String certNo;
    /**
     * 是否认证
     * name:need_confirm
     */
    private String needConfirm;
	
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
	
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getCertType() {
		return certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}
	
	public String getCertNo() {
		return certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	public String getNeedConfirm() {
		return needConfirm;
	}
	public void setNeedConfirm(String needConfirm) {
		this.needConfirm = needConfirm;
	}

    
}
