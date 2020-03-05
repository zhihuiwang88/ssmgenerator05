package com.nengliang.web.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nengliang.web.dao.UserInfoMapper;
import com.nengliang.web.entity.UserInfo;
import com.nengliang.web.service.UserInfoService;
@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoMapper userInfoMapper;

	public int add(UserInfo userInfo) {
		
		return userInfoMapper.insert(userInfo);
	}
	
	
	
}
