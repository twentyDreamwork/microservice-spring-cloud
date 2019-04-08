package com.cloud.provider.user.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.provider.user.entity.User;
import com.cloud.provider.user.mappers.UserMapper;

@Service
public class UserService {
	
	
	@Autowired
	private UserMapper userMapper;
	
	
	
	public User findBbId(int id) {
		return userMapper.findById(id);
	}
	
	
	

}
