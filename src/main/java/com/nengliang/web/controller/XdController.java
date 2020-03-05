package com.nengliang.web.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nengliang.web.dto.XdDTO;
import com.nengliang.web.entity.PaData;
import com.nengliang.web.entity.PaSource;
import com.nengliang.web.entity.UserInfo;
import com.nengliang.web.service.PaDataService;
import com.nengliang.web.service.PaSourceService;
import com.nengliang.web.service.UserInfoService;
import com.nengliang.web.serviceImpl.ParamsImpl;
import com.nengliang.web.util.JacksonFilterUtil;
import com.nengliang.web.util.XdUtil;
import com.nengliang.web.vo.DataParamVO;
import com.nengliang.web.vo.XdVO;

@Controller
@RequestMapping("/xd")
public class XdController {
	
	@Autowired
	private  PaDataService paDataService;
	@Autowired
	private  PaSourceService paSourceService;
	@Autowired
	private  UserInfoService userInfoService;
	/**
	 * localhost:8081/ssmgenerator/xd/receptionJsonRpc
	 * @param xdVO
	 * @return
	 */
	
	@SuppressWarnings({ "unchecked", "unused", "rawtypes" })
	@PostMapping("/receptionJsonRpc")
	@ResponseBody
	public XdDTO receptionData(@RequestBody XdVO xdVO) {
		String json = JacksonFilterUtil.beanToJson(xdVO);
		ParamsImpl paramsImpl = new ParamsImpl();
		Map<String, Object> jsonMap = JacksonFilterUtil.jsonToMap(json);
		Map<String, Object> paramsMap = (Map<String, Object>) jsonMap.get("params");
		PaSource paSource = new PaSource();
		paSource.setSign((String)paramsMap.get("sign"));
		Map<String, Object> dataMap = (Map<String, Object>) paramsMap.get("data");
		//data
		DataParamVO dataVO = new DataParamVO();
		dataVO.setConditiones((String)dataMap.get("condition"));
		dataVO.setDataObjId((String)dataMap.get("dataObjId"));
		dataVO.setFieldes((String)dataMap.get("fields"));
		dataVO.setOrderBy((String)dataMap.get("orderBy"));
		dataVO.setVersion((String)dataMap.get("version"));
		dataVO.setSessionId((String)dataMap.get("sessionId"));
		Map<String, String> sourceMap = (Map<String, String>) dataMap.get("source");
		paSource.setSourceId(sourceMap.get("sourceId"));
		paSourceService.add(paSource);
		// UserInfo
		UserInfo userInfo = new UserInfo();
		Map<String, String> userInfoMap = (Map<String, String>) dataMap.get("userInfo");
		userInfo.setSfzh(userInfoMap.get("sfzh"));
		userInfo.setSn(userInfoMap.get("sn"));
		userInfo.setUserDeptNo(userInfoMap.get("userDeptNo"));
		userInfo.setUserId(userInfoMap.get("userId"));
		userInfo.setUserName(userInfoMap.get("userName"));
		userInfoService.add(userInfo);
		PaData paData = new PaData();
		BeanUtils.copyProperties(dataVO, paData);
		paDataService.add(paData);
		
		return XdUtil.succeed(null);
	}
	
}
