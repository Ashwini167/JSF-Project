package com.trial.dto;

public class UserDTO {
	
	private String userId;
	private String password;
	private char userType;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public char getUserType() {
		return userType;
	}
	public void setUserType(char userType) {
		this.userType = userType;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
}
