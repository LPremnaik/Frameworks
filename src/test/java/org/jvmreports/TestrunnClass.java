package org.jvmreports;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\91833\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\Selenium\\Cucumberframeworks\\src\\test\\resources\\report.feature"
,glue="org.jvmreports",
plugin="json:C:\\Users\\91833\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\Selenium\\Cucumberframeworks\\target\\jvmreport.json")

public class TestrunnClass {
//	@AfterClass
//	public static void tc0() {
//	Reporting.generateReport("C:\\Users\\91833\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\Selenium\\Cucumberframeworks\\target\\jvmreport.json");

}}
