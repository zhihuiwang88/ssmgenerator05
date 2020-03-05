package com.nengliang.web.vo;

import java.io.Serializable;

import com.nengliang.web.entity.PaSource;
import com.nengliang.web.entity.Page;
import com.nengliang.web.entity.UserInfo;

public class DataVO implements Serializable{

	private DataParamVO dataParamVO;
	private Page page;
	private SourceVO source;
	private UserInfo userInfo;
	public DataParamVO getDataParamVO() {
		return dataParamVO;
	}
	public void setDataParamVO(DataParamVO dataParamVO) {
		this.dataParamVO = dataParamVO;
	}
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public SourceVO getSource() {
		return source;
	}
	public void setSource(SourceVO source) {
		this.source = source;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	
}
