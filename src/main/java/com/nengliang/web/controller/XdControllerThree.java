package com.nengliang.web.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nengliang.web.dto.XdDTO;
import com.nengliang.web.entity.FieldValues;
import com.nengliang.web.entity.OperationsParams;
import com.nengliang.web.entity.UserInfo;
import com.nengliang.web.service.FieldValuesService;
import com.nengliang.web.service.OperationsParamsService;
import com.nengliang.web.service.UserInfoService;
import com.nengliang.web.util.JacksonFilterUtil;
import com.nengliang.web.util.XdUtil;
import com.nengliang.web.vo.FieldValuesVO;
import com.nengliang.web.vo.OperationsParamsVO;
import com.nengliang.web.vo.ParamsVO;
import com.nengliang.web.vo.UserInfoVO;
import com.nengliang.web.vo.XdVO;

@Controller
@RequestMapping("/xdThree")
public class XdControllerThree {

	@Autowired
	private UserInfoService userInfoService;
	@Autowired 
	private FieldValuesService  fieldValuesService;
	@Autowired 
	private OperationsParamsService operationsParamsService;
	
	/**
	 * localhost:8081/ssmgenerator/xdThree/jsonRpcThree
	 * @param xdDTO
	 * @return
	 */
	
	@SuppressWarnings("unchecked")
	@PostMapping("/jsonRpcThree")
	@ResponseBody
	public XdDTO receptionData(@RequestBody XdVO xdVO) {
		String json = JacksonFilterUtil.beanToJson(xdVO);
		XdVO beanXdVO = JacksonFilterUtil.jsonToBean(json, XdVO.class);
		String jsonParams = JacksonFilterUtil.beanToJson(beanXdVO.getParams());
		ParamsVO paramsVO = JacksonFilterUtil.jsonToBean(jsonParams,ParamsVO.class);
		// userInfo
		String jsonData = JacksonFilterUtil.beanToJson(paramsVO.getData());
		Map<String, Object> dataMap = JacksonFilterUtil.jsonToMap(jsonData);
		String jsonUserInfo = JacksonFilterUtil.beanToJson(dataMap.get("userInfo"));
		UserInfoVO userInfoVO = JacksonFilterUtil.jsonToBean(jsonUserInfo,UserInfoVO.class);
		UserInfo userInfo = new UserInfo();
		BeanUtils.copyProperties(userInfoVO, userInfo);
		userInfoService.add(userInfo);
		// 遍历Operations
		List<Map<String, Object>> listOperations = (List<Map<String, Object>>) dataMap.get("operations");
		for (Map<String, Object> mapOperations : listOperations) {
			OperationsParamsVO operationsParamsVO = new OperationsParamsVO();
			operationsParamsVO.setConditiones((String)mapOperations.get("condition"));
			operationsParamsVO.setDataObjId((String)mapOperations.get("dataObjId"));
			/*
			 * get("operationType")的结果是Integer类型，Map的value是string类型，报错Integer不能直接转String
			 * operationsParamsVO.setOperationType((String)mapOperations.get("operationType"));
			 * 解决：拿出来转String类型，然后再set
			 */
			String stringOperationType = mapOperations.get("operationType").toString();
			operationsParamsVO.setOperationType(stringOperationType);
			operationsParamsVO.setOperationId((String)mapOperations.get("operationId"));
			operationsParamsVO.setSourceId((String)mapOperations.get("sourceId"));
			OperationsParams operationsParams =new OperationsParams();
			BeanUtils.copyProperties(operationsParamsVO, operationsParams);
			operationsParamsService.insert(operationsParams);
			// 遍历data
			List<Map<String, Object>> listData = (List<Map<String, Object>>) mapOperations.get("data");
			for (Map<String, Object> mapData : listData) {
				List<Map<String, String>> listFieldValues = (List<Map<String, String>>) mapData.get("fieldValues");
				// 遍历 fieldValues
				for (Map<String, String> mapFieldValues : listFieldValues) {
					FieldValuesVO fieldValuesVO = new FieldValuesVO();
					fieldValuesVO.setField(mapFieldValues.get("field"));
					fieldValuesVO.setValue(mapFieldValues.get("value"));
					FieldValues fieldValues = new FieldValues();
					BeanUtils.copyProperties(fieldValuesVO , fieldValues);
					fieldValuesService.insert(fieldValues);
				}
			}
		}
		return XdUtil.succeed(xdVO);
	}
	
}
