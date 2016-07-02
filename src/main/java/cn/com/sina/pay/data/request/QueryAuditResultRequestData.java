package cn.com.sina.pay.data.request;

/**
 * 查询企业会员审核结果的请求
 * @author hassan.chiang@gmail.com
 *
 */
public class QueryAuditResultRequestData extends SinapayRequestData  {
	
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
	
}
