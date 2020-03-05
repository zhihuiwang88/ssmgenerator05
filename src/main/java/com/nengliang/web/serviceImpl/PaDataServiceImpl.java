package com.nengliang.web.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nengliang.web.dao.PaDataMapper;
import com.nengliang.web.entity.PaData;
import com.nengliang.web.service.PaDataService;

@Service
public class PaDataServiceImpl implements PaDataService {

	@Autowired
	private PaDataMapper paDataMapper;

	public int add(PaData paData) {
		return paDataMapper.insert(paData);
	}
	
}
