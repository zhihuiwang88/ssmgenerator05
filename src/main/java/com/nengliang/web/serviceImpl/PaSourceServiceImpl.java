package com.nengliang.web.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nengliang.web.dao.PaSourceMapper;
import com.nengliang.web.entity.PaSource;
import com.nengliang.web.service.PaSourceService;
@Service
public class PaSourceServiceImpl implements PaSourceService {

	@Autowired
	private PaSourceMapper paSourceMapper;

	public int add(PaSource paSource) {
		
		return paSourceMapper.insert(paSource);
	}
	
}
