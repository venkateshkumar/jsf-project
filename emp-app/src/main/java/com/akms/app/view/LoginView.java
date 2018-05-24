package com.akms.app.view;

import java.io.Serializable;

import javax.annotation.ManagedBean;



@ManagedBean
public class LoginView implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * Login logic whether user name and password is authenticated(Simple Authentication Mechanism)
	 * @return
	 */
	public String loginForm() {
		if(getUserName().equals(getPassword())) {
			return "Success";
		}
		 	return "Fail";
		
		
	}
	
	public void reset() {
		setUserName("");
		setPassword("");
	}
    
   

  
  

}
