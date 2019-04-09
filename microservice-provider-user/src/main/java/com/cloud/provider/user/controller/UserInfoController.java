package com.cloud.provider.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.provider.user.api.UserInfoService;
import com.cloud.provider.user.entity.UserInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="用户Controller")
public class UserInfoController {
	@Autowired
	private UserInfoService userInfoService;
	
	
	
	@GetMapping("/queryByUserId/{id}")
	@ApiOperation(value="根据用户编号获取用户信息", notes="根据用户编号获取用户信息")
	public UserInfo queryByUserId(@PathVariable("id")int id) {
		System.out.println("----");
		return userInfoService.queryByUserId(id);
	}
	

}
