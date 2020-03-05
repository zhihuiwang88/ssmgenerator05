package com.nengliang.web.util;

import com.nengliang.web.dto.XdDTO;

public class XdUtil {

	private static final String JSONRPC =  "2.0";
	private static final Integer XDID = 1;
	public static XdDTO succeed(Object result) {
		XdDTO xdDTO = new XdDTO();
		xdDTO.setId(XDID);
		xdDTO.setJsonrpc(JSONRPC);
		xdDTO.setResult(result);
		return xdDTO;
	}
	
}
