package com.nengliang.web.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nengliang.web.dao.FieldValuesMapper;
import com.nengliang.web.entity.FieldValues;
import com.nengliang.web.service.FieldValuesService;

@Service
public class FieldValuesServiceImpl implements FieldValuesService {

	@Autowired
	private FieldValuesMapper fieldValuesMapper;

	public int insert(FieldValues record) {
		return fieldValuesMapper.insert(record);
	}
	
}
