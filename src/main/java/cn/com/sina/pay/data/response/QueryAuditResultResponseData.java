package cn.com.sina.pay.data.response;

/**
 * 查询企业会员审核结果的响应
 * @author hassan.chiang@gmail.com
 *
 */
public class QueryAuditResultResponseData extends SinapayResponseData {
	
	/**
	 * 审核结果
	 * name:audit_result
	 */
	private String auditResult;
	
	/**
	 * 审核结果建议
	 * name:audit_mgs
	 */
	private String auditMgs;

	public String getAuditResult() {
		return auditResult;
	}

	public void setAuditResult(String auditResult) {
		this.auditResult = auditResult;
	}

	public String getAuditMgs() {
		return auditMgs;
	}

	public void setAuditMgs(String auditMgs) {
		this.auditMgs = auditMgs;
	}

}
