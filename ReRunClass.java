package com.stepdefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@C:\\Users\\kamesh p\\eclipse-workspace\\DataTableCucumber\\src\\test\\resources\\failes.txt",
glue = "com.stepdefination",monochrome = true)


public class ReRunClass {

}
