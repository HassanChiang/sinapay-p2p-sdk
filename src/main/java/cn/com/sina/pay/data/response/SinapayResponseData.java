package cn.com.sina.pay.data.response;

import cn.com.sina.pay.data.SinapayData;

public class SinapayResponseData extends SinapayData{
    /**
     * 响应时间
     * name:response_time
     * format:yyyyMMddHHmmss
     */
    private String responseTime;
    /**
     * 合作者身份ID
     * name:partner_id
     */
    private String partnerId;
    /**
     * 响应码
     * name:response_code
     */
    private String responseCode;
    /**
     * 响应信息
     * name:response_message
     */
    private String responseMessage;
    /**
     * 备注
     * name:memo
     */
    private String memo;
    
    public String getResponseTime() {
        return responseTime;
    }
    public void setResponseTime(String responseTime) {
        this.responseTime = responseTime;
    }
    public String getPartnerId() {
        return partnerId;
    }
    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }
    public String getResponseCode() {
        return responseCode;
    }
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }
    public String getResponseMessage() {
        return responseMessage;
    }
    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
    public String getMemo() {
        return memo;
    }
    public void setMemo(String memo) {
        this.memo = memo;
    }
}