package cn.com.sina.pay.data.request;

/**
 * 企业会员请求审核
 * 
 * @author haoxiang.jiang@gmail.com
 * @since 2016年4月22日上午10:36:45
 * 
 */
public class CreateAuditMemberInfosRequestData extends SinapayRequestData {
	/**
	 * 请求审核订单号 name:audit_order_no
	 **/
	private String auditOrderNo;
	/**
	 * 用户标识信息 name:identity_id
	 **/
	private String identityId;
	/**
	 * 用户标识类型 name:identity_type
	 **/
	private String identityType;
	/**
	 * 会员类型 name:member_type
	 **/
	private String memberType;
	/**
	 * 公司名称 name:company_name
	 **/
	private String companyName;
	/**
	 * 企业网址 name:website
	 **/
	private String website;
	/**
	 * 企业地址 name:address
	 **/
	private String address;
	/**
	 * 执照号 name:license_no
	 **/
	private String licenseNo;
	/**
	 * 营业执照所在地 name:license_address
	 **/
	private String licenseAddress;
	/**
	 * 执照过期日（营业期限） name:license_expire_date
	 **/
	private String licenseExpireDate;
	/**
	 * 营业范围 name:business_scope
	 **/
	private String businessScope;
	/**
	 * 联系电话 name:telephone
	 **/
	private String telephone;
	/**
	 * 联系Email name:email
	 **/
	private String email;
	/**
	 * 组织机构代码 name:organization_no
	 **/
	private String organizationNo;
	/**
	 * 企业简介 name:summary
	 **/
	private String summary;
	/**
	 * 企业法人 name:legal_person
	 **/
	private String legalPerson;
	/**
	 * 法人证件号码 name:cert_no
	 **/
	private String certNo;
	/**
	 * 证件类型 name:cert_type
	 **/
	private String certType;
	/**
	 * 法人手机号码 name:legal_person_phone
	 **/
	private String legalPersonPhone;
	/**
	 * 银行编号 name:bank_code
	 **/
	private String bankCode;
	/**
	 * 银行卡号 name:bank_account_no
	 **/
	private String bankAccountNo;
	/**
	 * 卡类型 name:card_type
	 **/
	private String cardType;
	/**
	 * 卡属性 name:card_attribute
	 **/
	private String cardAttribute;
	/**
	 * 开户行省份 name:province
	 **/
	private String province;
	/**
	 * 开户行城市 name:city
	 **/
	private String city;
	/**
	 * 支行名称 name:bank_branch
	 **/
	private String bankBranch;
	/**
	 * 文件名称 name:fileName
	 **/
	private String fileName;
	/**
	 * 文件摘要 name:digest
	 **/
	private String digest;
	/**
	 * 文件摘要算法 name:type
	 **/
	private String digestType;
	/**
	 * 扩展信息 name:extend_param
	 **/
	private String extendParam;

	public String getAuditOrderNo() {
		return auditOrderNo;
	}

	public void setAuditOrderNo(String auditOrderNo) {
		this.auditOrderNo = auditOrderNo;
	}

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

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getLicenseAddress() {
		return licenseAddress;
	}

	public void setLicenseAddress(String licenseAddress) {
		this.licenseAddress = licenseAddress;
	}

	public String getLicenseExpireDate() {
		return licenseExpireDate;
	}

	public void setLicenseExpireDate(String licenseExpireDate) {
		this.licenseExpireDate = licenseExpireDate;
	}

	public String getBusinessScope() {
		return businessScope;
	}

	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOrganizationNo() {
		return organizationNo;
	}

	public void setOrganizationNo(String organizationNo) {
		this.organizationNo = organizationNo;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getLegalPerson() {
		return legalPerson;
	}

	public void setLegalPerson(String legalPerson) {
		this.legalPerson = legalPerson;
	}

	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getLegalPersonPhone() {
		return legalPersonPhone;
	}

	public void setLegalPersonPhone(String legalPersonPhone) {
		this.legalPersonPhone = legalPersonPhone;
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

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getDigest() {
		return digest;
	}

	public void setDigest(String digest) {
		this.digest = digest;
	}

	public String getDigestType() {
		return digestType;
	}

	public void setDigestType(String digestType) {
		this.digestType = digestType;
	}

	public String getExtendParam() {
		return extendParam;
	}

	public void setExtendParam(String extendParam) {
		this.extendParam = extendParam;
	}

}
