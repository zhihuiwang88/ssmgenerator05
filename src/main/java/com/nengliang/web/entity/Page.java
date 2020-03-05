package com.nengliang.web.entity;

import java.io.Serializable;

public class Page implements Serializable{
/**
 * @param pageSize，每页多少条数据
 * @param pageNo，第几页
 * @param total，总页数
 * 20200303
 */
	private Integer pageSize;
	private Integer pageNo;
	private Integer total;
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	
	
}
