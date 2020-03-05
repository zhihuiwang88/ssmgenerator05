package com.nengliang.web.vo;

import java.io.Serializable;

public class DataParamVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3954921803907210585L;
	private String  version;
	private String  sessionId;
	private String  dataObjId;
	private String  conditiones;
	private String  fieldes;
	private String  orderBy;
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getDataObjId() {
		return dataObjId;
	}
	public void setDataObjId(String dataObjId) {
		this.dataObjId = dataObjId;
	}
	public String getConditiones() {
		return conditiones;
	}
	public void setConditiones(String conditiones) {
		this.conditiones = conditiones;
	}
	public String getFieldes() {
		return fieldes;
	}
	public void setFieldes(String fieldes) {
		this.fieldes = fieldes;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	
	
}
