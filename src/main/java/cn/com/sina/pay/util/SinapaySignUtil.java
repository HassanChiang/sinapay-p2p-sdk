package cn.com.sina.pay.util;

import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import cn.com.sina.pay.data.SinapayData;
import cn.com.sina.pay.data.constant.SinapayProperties;
import cn.com.sina.pay.data.response.SinapayResponseData;

public class SinapaySignUtil {
    public static String sign(String signSource) {
        signSource += SinapayProperties.getMd5Key();
        String sign = null;
        try {
            sign = hexMD5(signSource);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sign;
    }
    
    private static Map<String, String> skipProperties = new HashMap<String, String>();
    
    static {
        skipProperties.put("sign", "sign");
        skipProperties.put("sign_type", "sign_type");
        skipProperties.put("sign_version", "sign_version");
        skipProperties.put("input_charset", "input_charset");
    }
    
    public static String generateSignSourceString(SinapayData sinapaytData) {
        SortedMap<String, String> map = new TreeMap<String, String>();
        
        //只需要获取SinaPayRequestData或SinaPayResponseData及其子类的field即可，
        //不需要获取SinapayData定义的field，因为已经在skipProperties中忽略处理。
        if("cn.com.sina.pay.data.request.SinaPayRequestData".equals(
                    sinapaytData.getClass().getName()) ||
                "cn.com.sina.pay.data.response.SinaPayResponseData".equals(
                    sinapaytData.getClass().getName())) { //基类型
            map = getFieldValueFrom(sinapaytData, sinapaytData.getClass());
        } else { //子类型
            map = getFieldValueFrom(sinapaytData, sinapaytData.getClass());
            map.putAll(getFieldValueFrom(sinapaytData, sinapaytData.getClass().getSuperclass()));
        }
        
        SortedSet<String> fieldsSet = new TreeSet<String>();
        fieldsSet.addAll(map.keySet());
        Iterator<String> iterator = fieldsSet.iterator();
        StringBuffer paramsSb = new StringBuffer();
        //从接口文档来看，_input_charset应该是放在第一个的
        paramsSb.append("_input_charset").append("=").append(sinapaytData.getInputCharset()).append("&");
        while (iterator.hasNext()) {
            String fieldName = iterator.next();
            String snakeName = VariableNamingStyleUtil.camelToSnake(fieldName);
            String snakeValue = map.get(fieldName);
            if(skipProperties.get(snakeName) != null){
                continue;
            }
            paramsSb.append(snakeName).append("=").append(snakeValue).append("&");
        }
        return paramsSb.substring(0, paramsSb.length()-1);
    }
    
    private static SortedMap<String, String> getFieldValueFrom(Object instance, Class<?> clazz){
        SortedMap<String, String> map = new TreeMap<String, String>();
        Field[] fields = clazz.getDeclaredFields();
        Field.setAccessible(fields, true);
        for (Field field : fields) {
            Object o;
            try {
                o = field.get(instance);
                if(null != o){
                    map.put(field.getName(), ((String)o));   
                }
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                continue;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                continue;
            }
        }
        return map;
    }
    
    private static String hexMD5(String src) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] bs = md.digest(src.getBytes("UTF-8"));
        String r = new String(org.apache.commons.codec.binary.Hex.encodeHex(bs));
        return r.toLowerCase();
    }

    public static boolean checkSign(SinapayResponseData sinaPayResponseData) {
        String signSource = generateSignSourceString(sinaPayResponseData);
        String sign = sign(signSource);
        return sign.equals(sinaPayResponseData.getSign());
    }
}
