package com.cloud.provider.user.mappers;

import com.cloud.provider.user.entity.UserInfo;

public interface UserInfoMapper {
	
	public UserInfo queryByUserId(int id);
	

}
