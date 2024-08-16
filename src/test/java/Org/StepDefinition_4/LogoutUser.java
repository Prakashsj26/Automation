package Org.StepDefinition_4;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Org.Base_Class.Base_ClassPoc;
import Org.Pom.LoginUser_Pom;
import Org.Runner_Class.Runner_Poc;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutUser extends Base_ClassPoc {
	
	public static WebDriver driver =Runner_Poc.driver;

	public static LoginUser_Pom b= new LoginUser_Pom(driver);
	
 
	@Given("the user launch URL")
	public void the_user_launch_url() {
	  
		 geturl("https://automationexercise.com"); 
	}
	@Then("the user Verify that home page is visible successfully")
	public void the_user_verify_that_home_page_is_visible_successfully() {
	   
		 Assert.assertTrue("Home page is visible",b.getHome_page().isDisplayed());
	}
	@When("the user Click on Signup- Login button")
	public void the_user_click_on_signup_login_button() {
		click(b.getSignup_login());
	   
	}
	@Then("the user Verify Login to your account is visible")
	public void the_user_verify_login_to_your_account_is_visible() {
		  Assert.assertTrue("Login to your account is visible",b.getLogin_Account_Visible().isDisplayed());
	   
	}
	@When("the user Enter correct email address and password")
	public void the_user_enter_correct_email_address_and_password() {
		 send_keys(b.getEnter_login_Email(),"Satheshkmr25@gmail.com");
		  send_keys(b.getEnter_Login_Password(),"Sathesh@123");
	   
	}
	@When("the user Click login button")
	public void the_user_click_login_button() {
		 click(b.getClick_Login());
	   
	}
	@Then("the user Verify that Logged in as username is visible")
	public void the_user_verify_that_logged_in_as_username_is_visible() {
		  Assert.assertTrue("Logged username is visible",b.getLogged_username().isDisplayed());
	   
	}
	@When("the user Click Logout button")
	public void the_user_click_logout_button() {
	  click(b.getLogOut_Button());
	   
	}
	@Then("Verify that user is navigated to login page")
	public void verify_that_user_is_navigated_to_login_page() {
		 Assert.assertTrue("Login to your account is visible",b.getLogin_Account_Visible().isDisplayed());
	   
	}



}
