package com.ram.microservice.microserviceappws.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDetailsRequestModel {
	
	@NotNull(message="firstname can't be null")
	private String firstName;
	
	@NotNull(message="lastname can't be null")
	private String lastName;
	
	@NotNull
	@Email(message="email can't be null")
	private String email;
	
	@NotNull(message="Password can't be null")
	@Size(min=8,max=15,message="password must be b/w 8 to 15")
	private String password;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
