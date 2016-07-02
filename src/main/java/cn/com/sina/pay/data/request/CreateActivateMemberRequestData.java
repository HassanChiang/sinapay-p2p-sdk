package cn.com.sina.pay.data.request;

/**
 * 激活用户请求
 * @author hassan.chiang@gmail.com
 * @date 2016年4月20日 下午12:56:16
 */
public class CreateActivateMemberRequestData extends SinapayRequestData{
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
     * 会员类型
     * name:member_type
     */
    private String memberType;
    
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
}