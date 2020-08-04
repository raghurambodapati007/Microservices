package com.ram.microservice.microserviceappws.userService;

import com.ram.microservice.microserviceappws.ui.model.request.UserDetailsRequestModel;
import com.ram.microservice.microserviceappws.ui.model.response.UserRest;

public interface UserService {

	UserRest createUser(UserDetailsRequestModel userDetails);
	
}
