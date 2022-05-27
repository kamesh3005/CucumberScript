package com.stepdefination;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class JVMReportGeneration {
	
	public static void jvm(String pathName) {
		//To locate the floder
		File fl=new File("C:\\Users\\kamesh p\\eclipse-workspace\\DataTableCucumber\\JVMReport");
		
		
		//Add detials to report using configuration class 
		Configuration c=new Configuration(fl, "GreatindianFestival");
		c.addClassifications("Os", "Windows");
		c.addClassifications("Version", "10");
		c.addClassifications("BrowserName", "chrome");
		c.addClassifications("Version", "98");
		
		//Add the json file into the list<String>
		List<String>li=new ArrayList<String>();
		li.add(pathName);
		
		//creat object for the reportBuilder class
		
		ReportBuilder rb=new ReportBuilder(li, c);
		
		rb.generateReports();
		

	}

}
