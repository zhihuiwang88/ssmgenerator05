package com.nengliang.web.dto;

import java.io.Serializable;

public class XdDTO<T> implements Serializable{

	/**
	 * 返回数据处理
	 * 20200303
	 */
	private static final long serialVersionUID = -1366989437333488839L;
	private String jsonrpc;
	private Integer id;
	private T result;
	
	public String getJsonrpc() {
		return jsonrpc;
	}
	public void setJsonrpc(String jsonrpc) {
		this.jsonrpc = jsonrpc;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}
	
	
}
