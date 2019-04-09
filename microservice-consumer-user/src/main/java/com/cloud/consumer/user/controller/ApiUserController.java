package com.cloud.consumer.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cloud.consumer.user.entity.UserInfo;

@RestController
public class ApiUserController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/queryByUserId/{id}")
	public UserInfo findById(@PathVariable("id")int id) {
		System.out.println("--------------------");
		return restTemplate.getForObject("http://localhost:8181/microservice-provider-user/queryByUserId/"+id, UserInfo.class);
	}
	

	
	
	
}
