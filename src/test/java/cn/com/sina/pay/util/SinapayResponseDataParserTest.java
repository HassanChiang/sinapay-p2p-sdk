package cn.com.sina.pay.util;

import org.junit.Assert;
import org.junit.Test;

import cn.com.sina.pay.data.response.QueryHostingRefundResponseData;
import cn.com.sina.pay.data.response.SinapayResponseData;

public class SinapayResponseDataParserTest {
    @Test
    public void testParseStringToSinaPayResponseData(){
        SinapayResponseData s = SinapayResponseDataParser.parseStringToSinaPayResponseData("{"
              + "\"trade_list\":\""
              + "2013112405052323^还款^30.00^SUCCESS^20131117020101^20131117020101|"
              + "2013112405052324^还款^40.00^SUCCESS^20131117020102^20131117020102|"
              + "2013112405052325^还款^40.00^SUCCESS^20131117020103^20131117020103|"
              + "2013112405052326^还款^60.00^SUCCESS^20131117020104^20131117020104\","
              + "\"page_no\":1,"
              + "\"page_size\":30,"
              + "\"total_item\":23"
              + "}", QueryHostingRefundResponseData.class);
        QueryHostingRefundResponseData q = (QueryHostingRefundResponseData) s;
        Assert.assertEquals(4, q.getTradeList().size());
        Assert.assertEquals("1", q.getPageNo());
        Assert.assertEquals("30", q.getPageSize());
        Assert.assertEquals("23", q.getTotalItem());
    }
}
