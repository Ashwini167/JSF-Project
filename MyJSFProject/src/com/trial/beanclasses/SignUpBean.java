package com.trial.beanclasses;

import com.trial.controller.*;

public class SignUpBean {
	private String name;
	private char gender;
	private String dob;
	private long mobile;
	private String email;
	private String password;
	private String billingAddress;
	private String shippingAddress;
	private String userId;
	private char customerType;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
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
	
	public String getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public char getCustomerType() {
		return customerType;
	}
	public void setCustomerType(char customerType) {
		this.customerType = customerType;
	}
	
	public String createUser() {
		String actionResult = "failure";
		SignUpController signUp = new SignUpController();
		try {
			actionResult = signUp.addUser(name,gender,dob,email,mobile, mobile, billingAddress,shippingAddress,userId, password,customerType);
		}
		catch (Exception e){
			actionResult = "failure";
		}
		return actionResult;		
	}
	
	
}
