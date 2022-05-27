package com.stepdefination;

import org.junit.Assert;

import com.baseclass.AccountPojo;
import com.baseclass.BaseClass;

import cucumber.api.java.en.When;

public class BulkDataFBAccount extends BaseClass {

	@When("user has pass the firstname{string} to the field")
	public void userHasPassTheFirstnameToTheField(String firstName) {

		AccountPojo ap = new AccountPojo(driver);
		sendValues(ap.getFirst_name(), firstName);
	}

	@When("user has pass the lastname{string} to the field")
	public void userHasPassTheLastnameToTheField(String lastName) {
		AccountPojo ap = new AccountPojo(driver);
		
		sendValues(ap.getSure_name(), lastName);

	}

	@When("user has pass the moblie {string} number to the field")
	public void userHasPassTheMoblieNumberToTheField(String emailID) {
		AccountPojo ap = new AccountPojo(driver);

		sendValues(ap.getMobilNo(), emailID);

	}

	@When("user has send the password{string} to the field")
	public void userHasSendThePasswordToTheField(String password) {
		AccountPojo ap = new AccountPojo(driver);
		sendValues(ap.getPassword(), password);

	}

}
