package cn.com.sina.pay.util;

import org.junit.Assert;
import org.junit.Test;

import cn.com.sina.pay.data.request.CreateActivateMemberRequestData;

public class SignUtilTest {
    @Test
    public void testGenerateSignSourceString(){
        CreateActivateMemberRequestData requestData = new CreateActivateMemberRequestData();
        requestData.setMemo("aaa");
        requestData.setMemberType("111");
        String aaa = SinapaySignUtil.generateSignSourceString(requestData);
        Assert.assertEquals("_input_charset=UTF-8"
                + "&encrypt_version=1.0"
                + "&member_type=111"
                + "&memo=aaa"
                + "&version=1.0", aaa);
    }
    @Test
    public void testGenerateSignSourceString2(){
        CreateActivateMemberRequestData requestData = new CreateActivateMemberRequestData();
        requestData.setMemo("aaa");
        requestData.setMemberType("111");
        requestData.setIdentityId("bbb");
        requestData.setInputCharset("gbk");
        requestData.setNotifyUrl("http://blog.fenxiangz.com/sina_callback");
        String aaa = SinapaySignUtil.generateSignSourceString(requestData);
        Assert.assertEquals("_input_charset=gbk"
                + "&encrypt_version=1.0"
                + "&identity_id=bbb"
                + "&member_type=111"
                + "&memo=aaa"
                + "&notify_url=http://blog.fenxiangz.com/sina_callback"
                + "&version=1.0", aaa);
    }
    
    @Test
    public void testSign(){
        CreateActivateMemberRequestData requestData = new CreateActivateMemberRequestData();
        requestData.setMemo("aaa");
        requestData.setMemberType("111");
        requestData.setIdentityId("bbb");
        requestData.setInputCharset("gbk");
        requestData.setNotifyUrl("http://blog.fenxiangz.com/sina_callback");
        String aaa = SinapaySignUtil.generateSignSourceString(requestData);
        Assert.assertEquals("_input_charset=gbk"
                + "&encrypt_version=1.0"
                + "&identity_id=bbb"
                + "&member_type=111"
                + "&memo=aaa"
                + "&notify_url=http://blog.fenxiangz.com/sina_callback"
                + "&version=1.0", aaa);
        String bbb = SinapaySignUtil.sign(aaa);
        Assert.assertEquals("dfaea03b361a18d0bf28475512e1873e", bbb);
    }
}
