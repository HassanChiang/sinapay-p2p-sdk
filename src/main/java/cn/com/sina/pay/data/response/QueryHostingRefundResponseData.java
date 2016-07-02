package cn.com.sina.pay.data.response;

import java.util.List;

import cn.com.sina.pay.data.model.HostingRefundTradeDetailModel;

/**
 * 托管退款查询的响应
 * @author hassan.chiang@gmail.com
 *
 */
/**
 * @author hassan.chiang@gmail.com
 * @date 2016年4月22日 上午11:34:40
 */
public class QueryHostingRefundResponseData extends SinapayResponseData {
	
	/**
	 * 交易明细列表
	 * name:trade_list
	 */
	private List<HostingRefundTradeDetailModel> tradeList;
	
	/**
	 * 页号
	 * name:page_no
	 */
	private String pageNo;
	
	/**
	 * 每页大小
	 * name:page_size
	 */
	private String pageSize;
	
	/**
	 * 总记录数
	 * name:total_item
	 */
	private String totalItem;

	public List<HostingRefundTradeDetailModel> getTradeList() {
        return tradeList;
    }

    public void setTradeList(List<HostingRefundTradeDetailModel> tradeList) {
        this.tradeList = tradeList;
    }

    public String getPageNo() {
		return pageNo;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public String getPageSize() {
		return pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getTotalItem() {
		return totalItem;
	}

	public void setTotalItem(String totalItem) {
		this.totalItem = totalItem;
	}
}
