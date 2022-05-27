package com.stepdefination;


import org.junit.Assert;

import com.baseclass.AccountPojo;
import com.baseclass.BaseClass;

import cucumber.api.java.en.*;

public class AccoutCreationFB extends BaseClass {

	@Given("user has lauhch the google chrome browser and hit the facebook url")
	public void user_has_lauhch_the_google_chrome_browser_and_hit_the_facebook_url() {
		launchUrl("https://www.facebook.com/r.php?locale=en_GB&display=page");

	}

	@When("user has pass the first name to the firs name  text box")
	public void userHasPassTheFirstNameToTheFirsNameTextBox() throws InterruptedException {
		AccountPojo ap = new AccountPojo(driver);
		Thread.sleep(3000);
		sendValues(ap.getFirst_name(), "Kamesh");
	}

	@When("user has give the lastname to the text box field")
	public void userHasGiveTheLastnameToTheTextBoxField() {
		AccountPojo ap = new AccountPojo(driver);
		Assert.assertFalse(false);
		sendValues(ap.getSure_name(), "charumathi");

	}

	@When("usr has pass the valid moblie number to the particular field")
	public void usr_has_pass_the_valid_moblie_number_to_the_particular_field() throws InterruptedException {
		AccountPojo ap = new AccountPojo(driver);
		Thread.sleep(3000);

		sendValues(ap.getMobilNo(), "8508424423");

	}

	@When("user has send the valid  password")
	public void userHasSendTheValidPassword() {
		AccountPojo ap = new AccountPojo(driver);
		
		sendValues(ap.getPassword(), "Kamesh@1430");

	}

	@When("user has select  the date of birth")
	public void user_has_select_the_date_of_birth() throws InterruptedException {
		AccountPojo ap = new AccountPojo(driver);
		Thread.sleep(3000);

		select(ap.getDay(), "30");
		click(ap.getDay());
		select(ap.getMonths(), "May");
		click(ap.getMonths());
		select(ap.getYear(), "1994");
		Thread.sleep(3000);
		click(ap.getYear());

	}

	@When("user has click the Gender to the particular field")
	public void user_has_click_the_Gender_to_the_particular_field() throws InterruptedException {
		AccountPojo ap = new AccountPojo(driver);
		Thread.sleep(3000);

		click(ap.getGender());

	}

	@When("user has clik the sigup button")
	public void user_has_clik_the_sigup_button() throws InterruptedException {
		AccountPojo ap = new AccountPojo(driver);
		Thread.sleep(3000);

		click(ap.getSinup());

	}

}
