package com.stepdefination;

import com.baseclass.BaseClass;
import com.baseclass.FacebookPojo;

import cucumber.api.java.en.*;

public class ScenariosOutline extends BaseClass{

	
	
	@When("pass the username to the userName {string} text fiel")
	public void passTheUsernameToTheUserNameTextFiel(String username) {
		
		FacebookPojo pj=new FacebookPojo(driver);
		sendValues(pj.getUsername(),username);
		

	}

	@When("pass the password to the password {string} field")
	public void passThePasswordToThePasswordField(String password) {
		FacebookPojo pj=new FacebookPojo(driver);
		sendValues(pj.getPassword(), password);

		
		
	}

	@When("click the login button")
	public void clickTheLoginButton() {
		FacebookPojo pj=new FacebookPojo(driver);
		click(pj.getLogin());

	   
	}

	@When("close the browser")
	public void closeTheBrowser() {
	    
	}

}
