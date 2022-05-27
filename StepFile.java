package com.stepdefination;

import java.util.List;

import org.junit.Assert;

import com.baseclass.AmazonPojo;
import com.baseclass.BaseClass;
import com.baseclass.FacebookPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class StepFile extends BaseClass {

	@Given("First user as hit the GC browser and click the facebook url")
	public void firstUserAsHitTheGCBrowserAndClickTheFacebookUrl() {
		launchUrl("https://www.facebook.com/login/");

	}

	@When("user has pass the userName to the faebook user name field")
	public void userHasPassTheUserNameToTheFaebookUserNameField(DataTable d) {
		FacebookPojo fb = new FacebookPojo(driver);
		List<String> al = d.asList();
		String data = al.get(3);
		sendValues(fb.getUsername(), data);
		String attribut = getAttribut(fb.getUsername(), data);
		System.out.println("The user name is: " +attribut);

	}

	@When("user has pass the invalid password to the password field")
	public void userHasPassTheInvalidPasswordToThePasswordField(DataTable d) {
		FacebookPojo fb = new FacebookPojo(driver);
		List<List<String>> als = d.asLists();
		String data = als.get(2).get(1);
		Assert.assertTrue(false);
		sendValues(fb.getPassword(), data);
		String attribut = getAttribut(fb.getPassword(), data);

		System.out.println("The Password is :"+attribut);
	}

	@When("user has clik the login button")
	public void userHasClikTheLoginButton() throws InterruptedException {
		FacebookPojo fb = new FacebookPojo(driver);
		click(fb.getLogin());
		Thread.sleep(5000);

	}

	@Then("user has close the browser")
	public void userHasCloseTheBrowser() {

	}

}
