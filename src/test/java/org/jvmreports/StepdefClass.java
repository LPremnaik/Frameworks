package org.jvmreports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepdefClass {
	WebDriver driver;
	@Given("users open the url")
	public void users_open_the_url() {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   
	   driver.get("https://www.facebook.com/");
	}

	@When("users enters  username and password")
	public void users_enters_username_and_password() {
	   WebElement username = driver.findElement(By.id("email"));
	   username.sendKeys("prem123@gmail.com");
	   driver.findElement(By.id("pass")).sendKeys("premnaik");
	   
	}

	@And("users clc  the login button")
	public void users_clc_the_login_button() {
	    driver.findElement(By.name("login")).click();
	}

	@Then("user validates the home page")
	public void user_validates_the_home_page() {
	    Assert.assertTrue(true);
	}




}
