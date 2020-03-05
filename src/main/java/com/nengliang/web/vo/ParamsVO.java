package com.nengliang.web.vo;

import java.io.Serializable;

public class ParamsVO<T> implements Serializable{

	private T data;
	private String sign;
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	
	
}
