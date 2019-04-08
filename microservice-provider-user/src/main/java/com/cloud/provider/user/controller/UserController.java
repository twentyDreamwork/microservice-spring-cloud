package com.cloud.provider.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.provider.user.entity.User;
import com.cloud.provider.user.mappers.UserMapper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="用户Controller")
public class UserController {
	@Autowired
	private UserMapper userMapper;
	
	
	
	@GetMapping("findById")
	@ApiOperation(value="根据用户编号获取用户信息", notes="根据用户编号获取用户信息")
	public User findById() {
		System.out.println("----");
		return userMapper.findById(1);
	}
	
	@GetMapping("a")
	@ApiOperation(value="a", notes="a")
	public String a() {
		return "succ";
	}

}
