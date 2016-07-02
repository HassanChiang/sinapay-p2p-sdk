package cn.com.sina.pay.util;
import org.junit.Assert;
import org.junit.Test;

import cn.com.sina.pay.util.VariableNamingStyleUtil;


public class VariableNamingStyleUtilTest {
    @Test
    public void testCamelToSnake(){
        String a = VariableNamingStyleUtil.camelToSnake("aaaBbbCccDcjd");
        Assert.assertEquals("aaa_bbb_ccc_dcjd", a);
        a = VariableNamingStyleUtil.camelToSnake("AaaBbbCccDcjd999");
        Assert.assertEquals("aaa_bbb_ccc_dcjd999", a);
    }

    @Test
    public void testSnakeToCamel(){
        String a = VariableNamingStyleUtil.snakeToCamel("aaa_bbb_ccc_dcjd");
        Assert.assertEquals("aaaBbbCccDcjd", a);
        a = VariableNamingStyleUtil.snakeToCamel("aaa_bbb_ccc_dcjd999");
        Assert.assertEquals("aaaBbbCccDcjd999", a);
    }
}
