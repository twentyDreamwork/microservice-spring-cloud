package com.cloud.provider.user.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.provider.user.entity.UserInfo;
import com.cloud.provider.user.mappers.UserInfoMapper;

@Service
public class UserInfoService {
	
	
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	
	
	public UserInfo queryByUserId(int id) {
		return userInfoMapper.queryByUserId(id);
	}
	
	
	

}
