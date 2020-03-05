package com.nengliang.web.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nengliang.web.dao.OperationsParamsMapper;
import com.nengliang.web.entity.OperationsParams;
import com.nengliang.web.service.OperationsParamsService;
@Service
public class OperationsParamsImpl implements OperationsParamsService {

	@Autowired
	private OperationsParamsMapper  operationsParamsMapper;

	public int insert(OperationsParams record) {
		return operationsParamsMapper.insert(record);
	}
	
}
