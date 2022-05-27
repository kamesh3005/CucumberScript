package com.stepdefination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.baseclass.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseClass {
	
	@Before
	public void openBrowser() {
		lauhchBrowser();
	}
	
	@After
	public void close() {
		driver.close();

	}
	
	@After
	public void afterTakeScreenshort(Scenario s) {
		
		if(s.isFailed()) {
			
			
			TakesScreenshot tk=(TakesScreenshot)driver;
			
			byte[] screenshotAs = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshotAs, "image/png");
		}
		
		
	}

}
