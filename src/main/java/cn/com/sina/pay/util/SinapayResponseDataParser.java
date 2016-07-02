package cn.com.sina.pay.util;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import cn.com.sina.pay.data.SinapayData;
import cn.com.sina.pay.data.response.SinapayResponseData;

public class SinapayResponseDataParser {
    private static Map<String, String> skipProperties = new HashMap<String, String>();
    private static Map<String, String> cumstomizeSnakeName = new HashMap<String, String>();
    static {
        skipProperties.put("input_charset", "input_charset");
        cumstomizeSnakeName.put("input_charset", "_input_charset");
    }

    public static SinapayResponseData parseStringToSinaPayResponseData(
            String responseJsonString,
            Class<? extends SinapayResponseData> clazz) {
        if (StringUtils.isBlank(responseJsonString)) {
            return null;
        }
        JSONObject jsonObject = JSON.parseObject(responseJsonString);
        if (null == jsonObject) {
            return null;
        }
        SinapayResponseData responseData = null;
        try {
            responseData = clazz.newInstance();
            if ("cn.com.sina.pay.data.response.SinaPayResponseData"
                    .equals(clazz.getName())) { // 基类型
                fillProperties(clazz, jsonObject, responseData);
                fillProperties((Class<SinapayData>) clazz.getSuperclass(),
                        jsonObject, responseData);
            } else { // 子类型
                fillProperties(clazz, jsonObject, responseData);
                fillProperties(
                        (Class<SinapayResponseData>) clazz.getSuperclass(),
                        jsonObject, responseData);
                fillProperties((Class<SinapayData>) clazz.getSuperclass()
                        .getSuperclass(), jsonObject, responseData);
            }
        } catch (InstantiationException e1) {
            e1.printStackTrace();
        } catch (IllegalAccessException e1) {
            e1.printStackTrace();
        }
        return responseData;
    }

    private static void fillProperties(Class<? extends SinapayData> clazz,
            JSONObject jsonObject, SinapayResponseData responseData)
            throws IllegalAccessException {
        Field[] clazzFields = clazz.getDeclaredFields();
        Field.setAccessible(clazzFields, true);
        for (Field field : clazzFields) {
            String snakeName = VariableNamingStyleUtil.camelToSnake(field.getName());
            if (skipProperties.get(snakeName) == null) {//不需要跳过的属性
                if (field.getType() == List.class || field.getType().getClass().isAssignableFrom(List.class)) {//如果是集合类属性需要单独处理
                    String fieldValueString = (null == jsonObject.get(snakeName)) ? "" : (String) jsonObject.get(snakeName);
                    if (StringUtils.isBlank(fieldValueString)) {
                        continue;
                    } else {
                        String[] listData = fieldValueString.split("\\|");
                        if (listData.length < 1) {
                            continue;
                        } else {
                            //对集合类型属性继续填充数据
                            ArrayList<Object> arrayList = buildListFieldValue(field, listData);
                            field.set(responseData, arrayList);
                        }
                    }
                } else {//字符串类型属性直接赋值
                    field.set(responseData, jsonObject.getString(snakeName));
                }
            } else {//定制属性名
                field.set(responseData, jsonObject.getString(cumstomizeSnakeName.get(snakeName)));
            }
        }
    }

    private static ArrayList<Object> buildListFieldValue(Field field, String[] listData) throws IllegalAccessException {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Type fieldGenericType = field.getGenericType();
        Class<?> fieldGenericTypeClass = getGenericTypeByIndex(fieldGenericType, 0);
        for (String oneData : listData) {
            String[] targetClassDataArray = oneData.split("\\^");
            try {
                Object oneTargetObject = fieldGenericTypeClass.newInstance();
                Field[] targetClassFields = oneTargetObject.getClass().getDeclaredFields();
                SortedSet<String> targetClassFieldNameSet = new TreeSet<String>();
                for (Field targetClassField : targetClassFields) {
                    targetClassFieldNameSet.add(targetClassField.getName());
                }
                if (targetClassFieldNameSet.size() != targetClassDataArray.length) {
                    throw new ArrayIndexOutOfBoundsException(
                            "解析新浪支付响应时，对象" + oneTargetObject.getClass().getName()
                                    + "参数列表的数量:" + targetClassFieldNameSet.size()
                                    + "和收到响应的数量" + targetClassDataArray.length + "不一致");
                }
                // 遍历额外参数列表
                int i = 0;
                for (String targetClassFieldName : targetClassFieldNameSet) {
                    try {
                        Field fi = fieldGenericTypeClass.getDeclaredField(targetClassFieldName);
                        Field.setAccessible(new Field[]{fi}, true);
                        fi.set(oneTargetObject, targetClassDataArray[i]);
                    } catch (NoSuchFieldException e) {
                        e.printStackTrace();
                    } catch (SecurityException e) {
                        e.printStackTrace();
                    }
                    i++;
                }
                arrayList.add(oneTargetObject);
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    public static Class getGenericTypeByIndex(Type genType, int index) {
        if (!(genType instanceof ParameterizedType)) {
            return Object.class;
        }
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
        if (index >= params.length || index < 0) {
            throw new RuntimeException("Index outof bounds");
        }
        if (!(params[index] instanceof Class)) {
            return Object.class;
        }
        return (Class) params[index];
    }
}
