package com.stepdefination;

import java.util.List;
import java.util.Map;

import com.baseclass.BaseClass;
import com.baseclass.InstaPojo;

import cucumber.api.java.en.*;
import io.cucumber.datatable.DataTable;

public class TwoDimentionMap extends BaseClass {

	@Given("user has launch the chrome browser and hit the facebook url")
	public void userHasLaunchTheChromeBrowserAndHitTheFacebookUrl() {

		launchUrl("https://www.instagram.com/accounts/login/");

	}

	@Given("user has pass the valid userName to the userName field")
	public void userHasPassTheValidUserNameToTheUserNameField(DataTable d) throws InterruptedException {
		InstaPojo ip = new InstaPojo(driver);
		Map<String, String> mp = d.asMap(String.class, String.class);
		String data = mp.get("email4");
		Thread.sleep(3000);
		sendValues(ip.getUsername(), data);

	}

	@Given("user has pass the invalid password")
	public void userHasPassTheInvalidPassword(DataTable d) {
		InstaPojo ip = new InstaPojo(driver);
		List<Map<String, String>> mps = d.asMaps();
		String data = mps.get(2).get("pass2");
		sendValues(ip.getPassword(), data);

	}

	@Given("user has click the login button")
	public void userHasClickTheLoginButton() {
		InstaPojo ip = new InstaPojo(driver);
		click(ip.getLogin());
	}

}
