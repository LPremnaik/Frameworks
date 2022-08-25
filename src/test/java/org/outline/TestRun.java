package org.outline;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\91833\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\Selenium\\Cucumberframeworks\\src\\test\\resources\\outline.feature",glue="org.outline"
,dryRun=false,monochrome=true,
//plugin="html:C:\\Users\\91833\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\Selenium\\Cucumberframeworks\\target"
//plugin="junit:C:\\Users\\91833\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\Selenium\\Cucumberframeworks\\target\\prem.xml"
//plugin="json:C:\\Users\\91833\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\Selenium\\Cucumberframeworks\\target\\naik.json"
snippets=SnippetType.CAMELCASE)
public class TestRun {

}
