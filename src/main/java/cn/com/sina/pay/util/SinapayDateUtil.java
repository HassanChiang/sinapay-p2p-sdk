package cn.com.sina.pay.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SinapayDateUtil {
    public static String getNowString(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        return sdf.format(date);
    }
}
