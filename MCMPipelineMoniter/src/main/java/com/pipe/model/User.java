package com.pipe.model;

import javax.persistence.Entity;
import javax.persistence.Id;


import org.springframework.stereotype.Component;

@Entity
@Component
public class User {
	@Id
	private String Username;
	private String Password;
	private String UserType;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password, String userType) {
		super();
		Username = username;
		Password = password;
		UserType = userType;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getUserType() {
		return UserType;
	}
	public void setUserType(String userType) {
		UserType = userType;
	}
	@Override
	public String toString() {
		return "User [Username=" + Username + ", Password=" + Password + ", UserType=" + UserType + "]";
	}
	
	
}
