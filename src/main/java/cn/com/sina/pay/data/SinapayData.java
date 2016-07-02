package cn.com.sina.pay.data;

/**
 * 新浪支付接口交互数据基类
 * @author hassan.chiang@gmail.com
 * @date 2016年4月20日 上午10:27:33
 */
public class SinapayData {
    /**
     * 签名
     * name:sign 
     */
    private String sign;
    /**
     * 签名方式
     * name:sign_type
     */
    private String signType="MD5";
    /**
     * 签名版本号
     * name:sign_version
     */
    private String signVersion = "1.0";
    /**
     * 参数编码字符集
     * name:_input_charset 
     */
    private String inputCharset = "UTF-8";
    
    public String getInputCharset() {
        return inputCharset;
    }
    public void setInputCharset(String inputCharset) {
        this.inputCharset = inputCharset;
    }
    public String getSign() {
        return sign;
    }
    public void setSign(String sign) {
        this.sign = sign;
    }
    public String getSignType() {
        return signType;
    }
    public void setSignType(String signType) {
        this.signType = signType;
    }
    public String getSignVersion() {
        return signVersion;
    }
    public void setSignVersion(String signVersion) {
        this.signVersion = signVersion;
    }
}
