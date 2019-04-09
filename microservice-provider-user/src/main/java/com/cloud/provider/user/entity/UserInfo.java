package com.cloud.provider.user.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserInfo implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String userName;
	private String passWord;
	private String email;
	private String phone;
	private Date createdAt;
	
	
}
