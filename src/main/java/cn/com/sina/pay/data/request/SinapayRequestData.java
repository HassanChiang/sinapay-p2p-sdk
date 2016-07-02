package cn.com.sina.pay.data.request;

import cn.com.sina.pay.data.SinapayData;

public class SinapayRequestData extends SinapayData{
    /**
     * 接口名称
     * name:service
     */
    private String service;
    /**
     * 接口版本
     * name:version
     */
    private String version = "1.0";
    /**
     * 请求时间
     * name:request_time
     * format:yyyyMMddHHmmss
     */
    private String requestTime;
    /**
     * 合作者身份ID
     * name:partner_id
     */
    private String partnerId;
    /**
     * 加密版本号
     * name:encrypt_version
     */
    private String encryptVersion = "1.0";
    /**
     * 系统异步回调通知地址
     * name:notify_url
     */
    private String notifyUrl;
    /**
     * 页面跳转同步返回页面路径
     * name:return_url
     */
    private String returnUrl;
    /**
     * 备注
     * name:memo
     */
    private String memo;
    
    /**
     * 扩展信息
     * name:extend_param
     */
    private String extendParam;
    
    public String getService() {
        return service;
    }
    public void setService(String service) {
        this.service = service;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public String getRequestTime() {
        return requestTime;
    }
    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }
    public String getPartnerId() {
        return partnerId;
    }
    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }
    public String getEncryptVersion() {
        return encryptVersion;
    }
    public void setEncryptVersion(String encryptVersion) {
        this.encryptVersion = encryptVersion;
    }
    public String getNotifyUrl() {
        return notifyUrl;
    }
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }
    public String getReturnUrl() {
        return returnUrl;
    }
    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }
    public String getMemo() {
        return memo;
    }
    public void setMemo(String memo) {
        this.memo = memo;
    }
    public String getExtendParam() {
        return extendParam;
    }
    public void setExtendParam(String extendParam) {
        this.extendParam = extendParam;
    }
}