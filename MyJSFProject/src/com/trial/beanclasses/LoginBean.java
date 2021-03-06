package com.trial.beanclasses;
import com.trial.controller.LoginController;
import com.trial.dto.LoginDTO;

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
		String actionResult = "failure";
		LoginDTO loginDTO = new LoginDTO();
		loginDTO.setUserID(getUserID());
		loginDTO.setPassword(getPassword());
		LoginController loginController = new LoginController();
		try {
		actionResult = loginController.authorizeUser(loginDTO);
		}
		catch (Exception e)
		{
			actionResult = "failure";
		}
		System.out.println("Return value "+actionResult);
		return actionResult;		
	}
	
}
