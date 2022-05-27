package com.stepdefination;

import java.util.List;
import java.util.Map;

import com.baseclass.BaseClass;
import com.baseclass.LoginPojoAmez;

import cucumber.api.java.en.*;
import io.cucumber.datatable.DataTable;

public class AmazonStpeInfile extends BaseClass {

	@Given("user has lauhch the chrome browser and hit the url")
	public void userHasLauhchTheChromeBrowserAndHitTheUrl() {

		launchUrl("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

	}

	@When("To pass the valid username to the user name field")
	public void toPassTheValidUsernameToTheUserNameField(DataTable d) {
		LoginPojoAmez lp = new LoginPojoAmez(driver);
		Map<String, String> mp = d.asMap(String.class, String.class);
		String data = mp.get("name2");
		sendValues(lp.getUsername(), data);
		String username = getAttribut(lp.getUsername(), data);
		System.out.println("The user name is: " + username);

	}

	@When("use has clik continu button")
	public void useHasClikContinuButton() {
		LoginPojoAmez lp = new LoginPojoAmez(driver);

		click(lp.getContinues());

	}

	@When("To pass the invalid password to the password field")
	public void toPassTheInvalidPasswordToThePasswordField(DataTable d) {
		LoginPojoAmez lp = new LoginPojoAmez(driver);
		List<Map<String, String>> lms = d.asMaps();
		String data = lms.get(2).get("pass3");
		sendValues(lp.getPassword(), data);
		String password = getAttribut(lp.getPassword(), data);
		System.out.println("The Password is :" + password);

	}

	@When("use has click sign_in option")
	public void useHasClickSign_inOption() {
		LoginPojoAmez lp = new LoginPojoAmez(driver);
		click(lp.getSign_in());

	}

}
