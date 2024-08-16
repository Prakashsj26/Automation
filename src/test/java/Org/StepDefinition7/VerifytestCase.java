package Org.StepDefinition7;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Org.Base_Class.Base_ClassPoc;
import Org.Pom.ContactUs_Pom;
import Org.Runner_Class.Runner_Poc;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifytestCase extends Base_ClassPoc {
	
	public static WebDriver driver =Runner_Poc.driver;
	
	public static ContactUs_Pom c = new ContactUs_Pom(driver);

	
	@Given("the user Launch the URL")
	public void the_user_launch_the_url() {
		
		 geturl("https://automationexercise.com"); 
	   
	}
	@Then("the user Verify that home page is visible successfully")
	public void the_user_verify_that_home_page_is_visible_successfully() {
	   
		 Assert.assertTrue("Home page is visible",c.getHome_page().isDisplayed());
	}
	@When("the user Click on Test Cases button")
	public void the_user_click_on_test_cases_button() {
	   click(c.getTestcase_click());
	   
	}
	@Then("the user  Verify user is navigated to test cases page successfully")
	public void the_user_verify_user_is_navigated_to_test_cases_page_successfully() {
	   Assert.assertTrue("testcase page is visible",c.getTestcase_page_visible().isDisplayed());
	   
	}


}
