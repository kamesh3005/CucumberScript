package com.stepdefination;

import com.baseclass.BaseClass;
import com.baseclass.InstaPojo;

import cucumber.api.java.en.When;

public class TwoDimMapScenarioOutline extends BaseClass {

	@When("user as pass the valid user name to username{string} field")
	public void userAsPassTheValidUserNameToUsernameField(String name) throws InterruptedException {

		InstaPojo ip = new InstaPojo(driver);
		Thread.sleep(3000);
		sendValues(ip.getUsername(), name);

	}

	@When("user has pass the invalid password to the password {string} field")
	public void userHasPassTheInvalidPasswordToThePasswordField(String password) throws InterruptedException {
		InstaPojo ip = new InstaPojo(driver);
		Thread.sleep(3000);
		sendValues(ip.getPassword(), password);

	}

	@When("user has hit the login button")
	public void userHasHitTheLoginButton() {
		InstaPojo ip = new InstaPojo(driver);
		click(ip.getLogin());

	}

}
