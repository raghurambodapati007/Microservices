package com.ram.microservice.microserviceappws.ui.model.response;

public class UserRest {

	private String firstName;
	private String lastName;
	private String email;
	private String userId;

	public UserRest() {
	}

	public UserRest(String firstName, String lastName, String email, String userId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userId = userId;
	}

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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override 
	public String toString() {
		return "UserRest [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", userId=" + userId
				+ "]";
	}
}
