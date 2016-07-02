package cn.com.sina.pay.util;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import cn.com.sina.pay.data.SinapayData;
import cn.com.sina.pay.data.request.SinapayRequestData;

public class SinapayRequestParamsUtil {
    private static Map<String, String> skipProperties = new HashMap<String, String>();
    static {
        skipProperties.put("input_charset", "input_charset");
    }
    
    public static String generateRequestParamsString(SinapayRequestData requestData) {
        Map<String, String> map = new HashMap<String, String>();
        
        if("cn.com.sina.pay.data.request.SinaPayRequestData".equals(
                requestData.getClass().getName())) {
            map.putAll(getFieldValueFrom(requestData, requestData.getClass()));
            map.putAll(getFieldValueFrom(requestData, (Class<SinapayData>) requestData.getClass().getSuperclass()));
        } else { //子类型
            map.putAll(getFieldValueFrom(requestData, requestData.getClass()));
            map.putAll(getFieldValueFrom(requestData, (Class<? extends SinapayRequestData>) requestData.getClass().getSuperclass()));
            map.putAll(getFieldValueFrom(requestData, (Class<SinapayData>) requestData.getClass().getSuperclass().getSuperclass()));
        }
        
        StringBuffer paramsSb = new StringBuffer();
        paramsSb.append("_input_charset").append("=").append(requestData.getInputCharset()).append("&");
        for (String fieldName : map.keySet()) {
            String snakeName = VariableNamingStyleUtil.camelToSnake(fieldName);
            String snakeValue = map.get(fieldName);
            if(skipProperties.get(snakeName) != null){
                continue;
            }
            paramsSb.append(snakeName).append("=").append(snakeValue).append("&");
        }
        return paramsSb.substring(0, paramsSb.length()-1);
    }
    
    private static Map<String, String> getFieldValueFrom(Object instance, Class<? extends SinapayData> clazz){
        HashMap<String, String> map = new HashMap<String, String>();
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

    public static String generateFormHtmlFragment(SinapayRequestData requestData, String url) {
        String queryString = generateRequestParamsString(requestData);
        String [] params = queryString.split("&");
        StringBuffer sb = new StringBuffer();
        sb.append("<form action=\"").append(url).append("\">\n");
        for (String string : params) {
            String[] as = string.split("=");
            if(as.length >= 2){
                sb.append("<input type='text' name='").append(as[0]).append("' ").append("value='").append(as[1]).append("' />\n");
            }
        }
        sb.append("</form>\n");
        return sb.toString();
    }
}
