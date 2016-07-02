package cn.com.sina.pay.data.constant;

import java.io.IOException;
import java.util.Properties;

public class SinapayProperties {
    private static Properties properties = new Properties();
    
    static {
        try {
            properties.load(Thread.currentThread().getContextClassLoader()
                    .getResourceAsStream("sinapay.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static String getMd5Key(){
        return properties.get("sinapay_md5_key").toString();
    }
    public static String getMemberGateway(){
        return properties.get("sinapay_member_gateway").toString();
    }
    public static String getOrderGateway(){
        return properties.get("sinapay_order_gateway").toString();
    }
    public static String getSftpUsername(){
        return properties.get("sinapay_sftp_username").toString();
    }
    public static String getSftpAddress(){
        return properties.get("sinapay_sftp_address").toString();
    }
    public static String getSftpPort(){
        return properties.get("sinapay_sftp_port").toString();
    }
    public static String getPartnerId() {
        return properties.get("sinapay_partner_id").toString();
    }
    
    public static String getNotifyUrl(){
        return properties.get("sinapay_notify_url").toString();
    }
    public static String getReturnUrl(){
        return properties.get("sinapay_return_url").toString();
    }
}
