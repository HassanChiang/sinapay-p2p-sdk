package cn.com.sina.pay.util;

import java.util.ArrayList;
import java.util.List;

public class VariableNamingStyleUtil {
    private static final String RE_CAMELCASE_OR_UNDERSCORE = "(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])|_";
    
    public static String camelToSnake(String string){
        List<String> words = new ArrayList<String>();
        for (String word : string.split(RE_CAMELCASE_OR_UNDERSCORE)) {
            if (!word.isEmpty()) {
                words.add(word.toLowerCase());
            }
        }
        StringBuffer sb = new StringBuffer();
        for (String string2 : words) {
            sb.append(string2).append("_");
        }
        return sb.substring(0,sb.length()-1);
    }
    
    public static String snakeToCamel(String string){
        List<String> words = new ArrayList<String>();
        for (String word : string.split(RE_CAMELCASE_OR_UNDERSCORE)) {
            if (!word.isEmpty()) {
                words.add(word.toLowerCase());
            }
        }
        StringBuffer sb = new StringBuffer();
        for (String string2 : words) {
            sb.append(string2.substring(0,1).toUpperCase()).append(string2.substring(1));
        }
        return sb.substring(0,1).toLowerCase()+sb.substring(1);
    }
}
