package com.trial.beanclasses;
import com.trial.controller.LoginController;

public class LoginBean {
	private String userID;
	private String password;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String authorize() {
		String actionResult;
		LoginController loginController = new LoginController();
		try {
		actionResult = loginController.authorizeUser(getUserID(),getPassword());
		}
		catch (Exception e)
		{
			actionResult = "failure";
		}
		System.out.println("Return value "+actionResult);
		return actionResult;		
	}
	
}
