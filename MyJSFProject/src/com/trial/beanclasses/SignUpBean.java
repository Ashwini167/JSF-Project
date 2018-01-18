package com.trial.beanclasses;

import com.trial.controller.SignUpController;
import com.trial.dto.AddressDTO;
import com.trial.dto.UserDTO;
import com.trial.dto.UserDetailsDTO;

public class SignUpBean {
	private String firstName;
	private String lastName;
	private char gender;
	private String dob;
	private long mobile;
	private String email;
	private String password;
	private String billingAddress;
	private String shippingAddress;
	private String userId;
	private char userType;
	
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
	
	public String getShippingAddress() {
		return shippingAddress;
	}
	
	public void setShippingAddress(String shipingAddress) {
		this.shippingAddress = shipingAddress;
	}
	
	public String getBillingAddress() {
		return billingAddress;
	}
	
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	
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
	
	public String createUser() {
		String actionResult = "failure";
		
		UserDTO userDTO = new UserDTO();
		userDTO.setUserId(getUserId());
		userDTO.setPassword(getPassword());
		userDTO.setUserType(getUserType());
		
		UserDetailsDTO userDetailsDTO = new UserDetailsDTO();
		userDetailsDTO.setUserId(getUserId());
		userDetailsDTO.setFirstName(getFirstName());
		userDetailsDTO.setLastName(getLastName());
		userDetailsDTO.setGender(getGender());
		userDetailsDTO.setDob(getDob());
		userDetailsDTO.setEmail(getEmail());
		userDetailsDTO.setMobile(getMobile());	
		
		AddressDTO addressDTO = new AddressDTO();
		addressDTO.setUserId(getUserId());
		addressDTO.setBillingAddress(getBillingAddress());
		addressDTO.setShippingAddress(getShippingAddress());
				
		SignUpController signUp = new SignUpController();
		try {
			actionResult = signUp.addUser(userDTO);
			if(actionResult.equals("success"))
				actionResult = signUp.addUserDetails(userDetailsDTO);
			if(actionResult.equals("success"))
				actionResult = signUp.addAddress(addressDTO);
		}
		catch (Exception e){
			actionResult = "failure";
		}
		return actionResult;		
	}
	
	public String checkAvailability() {
		String result = "unavailable";
		return result;
	}
	
}
