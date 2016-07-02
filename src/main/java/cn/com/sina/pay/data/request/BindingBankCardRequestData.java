package cn.com.sina.pay.data.request;

public class BindingBankCardRequestData extends SinapayRequestData{
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
     * 绑卡请求号
     * name:request_no
     */
    private String requestNo;
    /**
     * 银行编号
     * name:bank_code
     */
    private String bankCode;
    /**
     * 银行卡号
     * name:bank_account_no
     */
    private String bankAccountNo;
    /**
     * 户名
     * name:account_name
     */
    private String accountName;
    /**
     * 卡类型
     * name:card_type
     */
    private String cardType;
    /**
     * 卡属性
     * name:card_attribute
     */
    private String cardAttribute;
    /**
     * 证件类型
     * name:cert_type
     */
    private String certType;
    /**
     * 证件号码
     * name:cert_no
     */
    private String certNo;
    /**
     * 银行预留手机号
     * name:phone_no
     */
    private String phoneNo;
    /**
     * 有效期
     * name:validity_period
     */
    private String validityPeriod;
    /**
     * CVV2
     * name:verification_value
     */
    private String verificationValue;
    /**
     * 省份
     * name:province
     */
    private String province;
    /**
     * 城市
     * name:city
     */
    private String city;
    /**
     * 支行名称
     * name:bank_branch
     */
    private String bankBranch;
    /**
     * 认证方式
     * name:verify_mode
     */
    private String verifyMode;
	
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
	
	public String getRequestNo() {
		return requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}
	
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	public String getCardAttribute() {
		return cardAttribute;
	}
	public void setCardAttribute(String cardAttribute) {
		this.cardAttribute = cardAttribute;
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
	
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public String getValidityPeriod() {
		return validityPeriod;
	}
	public void setValidityPeriod(String validityPeriod) {
		this.validityPeriod = validityPeriod;
	}
	
	public String getVerificationValue() {
		return verificationValue;
	}
	public void setVerificationValue(String verificationValue) {
		this.verificationValue = verificationValue;
	}
	
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getBankBranch() {
		return bankBranch;
	}
	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}
	
	public String getVerifyMode() {
		return verifyMode;
	}
	public void setVerifyMode(String verifyMode) {
		this.verifyMode = verifyMode;
	}
	

}
