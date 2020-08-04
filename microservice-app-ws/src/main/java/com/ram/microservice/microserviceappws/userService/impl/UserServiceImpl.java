package com.ram.microservice.microserviceappws.userService.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.microservice.microserviceappws.shared.Utils;
import com.ram.microservice.microserviceappws.ui.model.request.UserDetailsRequestModel;
import com.ram.microservice.microserviceappws.ui.model.response.UserRest;
import com.ram.microservice.microserviceappws.userService.UserService;

@Service
public class UserServiceImpl implements UserService{

	Map<String,UserRest> users;
	Utils utils;
	
	public UserServiceImpl() {	
	}
	
	@Autowired
	public UserServiceImpl(Utils utils) {
		this.utils=utils;
	}

	@Override
	public UserRest createUser(UserDetailsRequestModel userDetails) {
		
		UserRest returnValue=new UserRest();
		returnValue.setEmail(userDetails.getEmail());
		returnValue.setFirstName(userDetails.getFirstName());
		returnValue.setLastName(userDetails.getLastName());
		
		String userId=utils.generateUserId();
		returnValue.setUserId(userId);
		
		if(users == null) users=new HashMap<>();
		users.put(userId,returnValue);
		return returnValue;
		
	}

}
