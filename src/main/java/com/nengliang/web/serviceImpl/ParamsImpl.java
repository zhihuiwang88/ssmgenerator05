package com.nengliang.web.serviceImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nengliang.web.dao.PaDataMapper;
import com.nengliang.web.dao.PaSourceMapper;
import com.nengliang.web.dao.UserInfoMapper;
import com.nengliang.web.entity.PaData;
import com.nengliang.web.entity.PaSource;
import com.nengliang.web.entity.UserInfo;
import com.nengliang.web.service.PaDataService;
import com.nengliang.web.util.JacksonFilterUtil;
import com.nengliang.web.vo.DataVO;

@Service
public class ParamsImpl {

	@Autowired
	private PaDataMapper paDataMapper;
	@Autowired
	private PaSourceMapper paSourceMapper;
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	
		
		
	
	
}
