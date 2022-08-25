package org.outline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Fboutline {
	
	WebDriver driver;

	@Given("user must be able to lanch facebook url")
	public void user_must_be_able_to_lanch_facebook_url() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	   
	}

	@When("locates the element and enters the {string} and {string}")
	public void locates_the_element_and_enters_the_and(String string, String string2) {
		driver.findElement(By.id("email")).sendKeys(string);
		driver.findElement(By.id("pass")).sendKeys(string2);
	    
	}

	@And("user click the login button")
	public void user_click_the_login_button() {
	    driver.findElement(By.name("login")).click();
	}

	@Then("user validate login page")
	public void user_validate_login_page() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	   
	}



}
