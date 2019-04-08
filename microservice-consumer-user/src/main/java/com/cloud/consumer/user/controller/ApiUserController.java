package com.cloud.consumer.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cloud.consumer.user.entity.User;

@RestController
public class ApiUserController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/ab")
	public User findById() {
		User user = restTemplate.getForObject("http://localhost:8181/findById", User.class);
		return user;
	}
	

	@GetMapping("/c")
	public String c() {
		System.out.println("000000000");
		return "SUCC";
	}
	
	
	
}
