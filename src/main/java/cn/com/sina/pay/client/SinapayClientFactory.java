package cn.com.sina.pay.client;

public class SinapayClientFactory {
    public static SinapayClient getSinapayHttpClient(){
        return new SinapayHttpClient();
    }
}