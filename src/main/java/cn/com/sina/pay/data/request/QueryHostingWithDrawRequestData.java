package cn.com.sina.pay.data.request;

public class QueryHostingWithDrawRequestData extends SinapayRequestData{
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
     * 用户标识类型
     * name:account_type
     */
    private String accountType;
	
}
