package org.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
	 System.out.println(" inside step");
	
	}

	@And("some other precondition")
	public void some_other_precondition() {
	 System.out.println(" inside step");
	
	}

	@When("I complete action")
	public void i_complete_action() {
	 System.out.println(" inside step");
	
	}

	@When("some other action")
	public void some_other_action() {
	 System.out.println(" inside step");
	
	}

	@And("yet another action")
	public void yet_another_action() {
	 System.out.println(" inside step");
	
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	 System.out.println(" inside step");
	
	}

	@And("check more outcomes")
	public void check_more_outcomes() {
	 System.out.println(" inside step");
	
	}
}
