package com.nengliang.web.dto;

import java.io.Serializable;

import com.nengliang.web.entity.Page;

public class ResultTwoDTO<T> implements Serializable{

	private Integer code;
	private String msg;
	private T data;
	private Page page;
	private String sign;
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	
	
}
