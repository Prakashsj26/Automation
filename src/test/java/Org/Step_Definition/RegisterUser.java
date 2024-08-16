package Org.Step_Definition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Org.Base_Class.Base_ClassPoc;
import Org.Pom.SignUp;
import Org.Runner_Class.Runner_Poc;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterUser extends Base_ClassPoc {
	
	public static WebDriver driver = Runner_Poc.driver;
	
	public static SignUp a = new SignUp(driver);
	
	@Given("the user Launch Url")
	public void the_user_launch_url() {
	  geturl("https://automationexercise.com"); 
	  
	}
	@Then("the user Verify that home page is visible successfully")
	public void the_user_verify_that_home_page_is_visible_successfully() {
	  Assert.assertTrue("Homen page is visible ",a.getHome_page().isDisplayed());
	  
	}
	@When("the user Click on Signup Login button")
	public void the_user_click_on_signup_login_button() {
	   click(a.getSignup_login());
	  
	}
	@Then("the user verify New User Signup! is visible")
	public void the_user_verify_new_user_signup_is_visible() {
	   Assert.assertTrue("new user signup visible ",a.getNew_User_Signup().isDisplayed());
	  
	}
	@When("the user Enter name and email address")
	public void the_user_enter_name_and_email_address() {
		send_keys(a.getEnter_signup_name(), "satheshkumar");
	   send_keys(a.getEnter_signup_email(), "Satheshkmr25@gmail.com");
	  
	}
	@When("the user Click Signup button")
	public void the_user_click_signup_button() {
	   click(a.getSignup_Button());
	  
	}
	@Then("the user Verify that ENTER ACCOUNT INFORMATION is visible")
	public void the_user_verify_that_enter_account_information_is_visible() {
	   Assert.assertTrue("Enter account information is visible ",a.getEnter_Account_Information().isDisplayed());
	  
	}
	@When("the user Enter the details: Title, Name, Email, Password, Date of birth")
	public void the_user_enter_the_details_title_name_email_password_date_of_birth() {
	   click(a.getTitle());
	   send_keys(a.getPassword(),"Sathesh@123");
	   select_By_index(a.getDateOfBirth_Days(), 28);
	   select_By_index(a.getDateOfBirth_Months(), 1);
	   select_By_index(a.getDateOfBirth_Years(), 29);
	  
	  
	}
	@When("the user Select checkbox Sign up for our newsletter!")
	public void the_user_select_checkbox_sign_up_for_our_newsletter() {
		  click(a.getOur_Newsletter());
	  
	}
	@When("the user Select checkbox Receive special offers from our partners!")
	public void the_user_select_checkbox_receive_special_offers_from_our_partners() {
		 click(a.getOur_partner());
		   
	  
	}
	@When("the user enter the First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
	public void the_user_enter_the_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
	   send_keys(a.getFirst_name(),"sathesh");
	   send_keys(a.getLast_name(), "kumar");
	   send_keys(a.getCompany_name(),"JIO");
	   send_keys(a.getAddress1(), "67/A TVR Road kenikarai");
	   send_keys(a.getAddress2(),"Mayiladuthurai");
	   send_keys(a.getState(),"Tamilnadu");
	   send_keys(a.getCity(),"Mayiladuthurai");
	   send_keys(a.getZipcode(), "609001");
	   send_keys(a.getMobile_number(), "9043600374");
	   
	}
	@When("the user  Click Create Account button")
	public void the_user_click_create_account_button() {
		click(a.getCreate_Account_Button());
	  
	}
	@Then("the user  Verify that ACCOUNT CREATED! is visible")
	public void the_user_verify_that_account_created_is_visible() {
	   Assert.assertTrue("verify that account created",a.getAccount_Created().isDisplayed());
	  
	}
	@When("the user  Click Continue button")
	public void the_user_click_continue_button() {
	   click(a.getContinue());
	  
	}
	@Then("the user  Verify that Logged in as username is visible")
	public void the_user_verify_that_logged_in_as_username_is_visible() {
	   Assert.assertTrue("Logged in as username",a.getLogged_username().isDisplayed());
	  
	}
	@When("the user  Click Delete Account button")
	public void the_user_click_delete_account_button() {
	//  click(a.getDelete_account());
	  
	}
	@Then("the user Verify that ACCOUNT DELETED! is visible and click Continue button")
	public void the_user_verify_that_account_deleted_is_visible_and_click_continue_button() {
	   Assert.assertTrue("Account deleted",a.getAccount_Deleted().isDisplayed());
	   click(a.getFinal_Continue());
	  
	}

	
	}
