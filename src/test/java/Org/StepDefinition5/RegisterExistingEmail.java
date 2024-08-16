package Org.StepDefinition5;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Org.Base_Class.Base_ClassPoc;
import Org.Pom.LoginUser_Pom;
import Org.Pom.SignUp;
import Org.Runner_Class.Runner_Poc;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterExistingEmail extends Base_ClassPoc{
	
	public static WebDriver driver =Runner_Poc.driver;
	
	public static SignUp a = new SignUp(driver);
	public static LoginUser_Pom b= new LoginUser_Pom(driver);
	
	
	@Given("the user Launch URL")
	public void the_user_launch_url() {
	
		  geturl("https://automationexercise.com"); 
	   
	}
	@Then("the user  Verify that home page is visible successfully")
	public void the_user_verify_that_home_page_is_visible_successfully() {
		 Assert.assertTrue("Home page is visible",b.getHome_page().isDisplayed());
	   
	}
	@When("the user Click on Signup-Login button")
	public void the_user_click_on_signup_login_button() {
		click(b.getSignup_login());
	   
	}
	@Then("the user Verify New User Signup! is visible")
	public void the_user_verify_new_user_signup_is_visible() {
		Assert.assertTrue("new user signup visible ",a.getNew_User_Signup().isDisplayed());
		  
	   
	}
	@When("the user Enter name and already registered email address")
	public void the_user_enter_name_and_already_registered_email_address() {
		send_keys(a.getEnter_signup_name(), "satheshkumar");
		   send_keys(a.getEnter_signup_email(), "Satheshkmr25@gmail.com");
	   
	}
	@When("the user  Click Signup button")
	public void the_user_click_signup_button() {
		click(a.getSignup_Button());
	}
	@Then("Verify error Email Address already exist! is visible")
	public void verify_error_email_address_already_exist_is_visible() {
	   Assert.assertTrue("Email address already exist",b.getEmail_Already_Exist().isDisplayed());
	}

	   
	}




