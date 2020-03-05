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

import com.nengliang.web.dto.DataTwoDTO;
import com.nengliang.web.dto.FieldValuesDTO;
import com.nengliang.web.dto.ResultTwoDTO;
import com.nengliang.web.dto.XdDTO;
import com.nengliang.web.entity.FieldValues;
import com.nengliang.web.entity.Page;
import com.nengliang.web.service.FieldValuesService;
import com.nengliang.web.util.JacksonFilterUtil;
import com.nengliang.web.util.XdUtil;

@Controller
@RequestMapping("/xdTwo")
public class XdControllerTwo {

	@Autowired
	private FieldValuesService  fieldValuesService;
	
	/**
	 * localhost:8081/ssmgenerator/xdTwo/jsonRpcTwo
	 * @return
	 */
	
	@SuppressWarnings("unchecked")
	@PostMapping("/jsonRpcTwo")
	@ResponseBody
	public XdDTO receptionData(@RequestBody XdDTO xdDTO) {
		/*
		 * 方法成功1
		 * xdDTO转json串，json串转Map(K,V)。
		 * 使用jsonToMap
		 */
		String json = JacksonFilterUtil.beanToJson(xdDTO);
		Map<String, Object> josnMap = JacksonFilterUtil.jsonToMap(json);
		Map<String, Object> josnResult = (Map<String, Object>) josnMap.get("result");
		// page
		Page page = new Page();
		Map<String, Integer> mapPage = (Map<String, Integer>) josnResult.get("page");
		page.setPageNo(mapPage.get("pageNo"));
		page.setPageSize(mapPage.get("pageSize"));
		page.setTotal(mapPage.get("total"));
		// 数据遍历 data
		List<Map<String, Object>> arrayList = (List<Map<String, Object>>) josnResult.get("data");
		for (Map<String, Object> mapData : arrayList) {
			System.out.println("sourceId：" + mapData.get("sourceId"));
			List<Map<String, String>> fieldValuesList = (List<Map<String, String>>) mapData.get("fieldValues");
			for (Map<String, String> mapFieldValues : fieldValuesList) {
				FieldValuesDTO fieldValuesDTO = new FieldValuesDTO();
				fieldValuesDTO.setCodeValue(mapFieldValues.get("codeValue"));
				fieldValuesDTO.setField(mapFieldValues.get("field"));
				fieldValuesDTO.setValue(mapFieldValues.get("value"));
				fieldValuesDTO.setIsCode(mapFieldValues.get("isCode"));
				// 数据入库
				FieldValues fieldValues = new FieldValues();
				BeanUtils.copyProperties(fieldValuesDTO, fieldValues);
				fieldValuesService.insert(fieldValues);
			}
		}
		
		
		/*
		 * 方法成功2
		 * 用beanToJson和jsonToBean和jsonToList完成。
		 */
		
	/*	String json1 = JacksonFilterUtil.beanToJson(xdDTO);
		XdDTO xdDTOData = JacksonFilterUtil.jsonToBean(json1, XdDTO.class);
		String jsonResult = JacksonFilterUtil.beanToJson(xdDTOData.getResult());
		ResultTwoDTO resultTwoDTO = JacksonFilterUtil.jsonToBean(jsonResult,ResultTwoDTO.class);
		String jsonData = JacksonFilterUtil.beanToJson(resultTwoDTO.getData());
		List<DataTwoDTO> dataTwoDTO = JacksonFilterUtil.jsonToList(jsonData, DataTwoDTO.class);
		for (DataTwoDTO dataTwoDTO2 : dataTwoDTO) {
			String sourceId = dataTwoDTO2.getSourceId();
			List<FieldValuesDTO> fieldValuesDTOList= dataTwoDTO2.getFieldValues();
			for (FieldValuesDTO fieldValuesDTO : fieldValuesDTOList) {
				FieldValues fieldValues = new FieldValues();
				BeanUtils.copyProperties(fieldValuesDTO, fieldValues);
				fieldValuesService.insert(fieldValues);
			}
		}
		*/
		
		
		return XdUtil.succeed(xdDTO);
	}
	
}
