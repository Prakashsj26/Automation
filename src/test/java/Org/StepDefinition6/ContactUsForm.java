 package Org.StepDefinition6;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Org.Base_Class.Base_ClassPoc;
import Org.Pom.ContactUs_Pom;
import Org.Runner_Class.Runner_Poc;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsForm extends Base_ClassPoc {
	
	public static WebDriver driver =Runner_Poc.driver;
	
	public static ContactUs_Pom c = new ContactUs_Pom(driver);

	@Given("the user launch url http:automationexercise.com")
	public void the_user_launch_url_http_automationexercise_com() {
		 geturl("https://automationexercise.com"); 
	   
	}
	@Then("the user  Verify that home page is visible successfully")
	public void the_user_verify_that_home_page_is_visible_successfully() {
		 Assert.assertTrue("Home page is visible",c.getHome_page().isDisplayed());
	   
	}
	@When("the user  Click on Contact Us button")
	public void the_user_click_on_contact_us_button() {
	  click(c.getContactUs());
	   
	}
	@When("the user  Verify GET IN TOUCH is visible")
	public void the_user_verify_get_in_touch_is_visible() {
	  Assert.assertTrue("Get in touch is visible ",c.getGet_In_Touch_visible().isDisplayed());
	   
	}
	@When("the user  Enter name, email, subject and message")
	public void the_user_enter_name_email_subject_and_message() {
		send_keys(c.getEnter_Name(), "Sathesh");
	  send_keys(c.getEnter_Email(),"Satheshkmr2@gmail");
	  send_keys(c.getEnter_Subject(), "product issue");
	  send_keys(c.getEnter_Message(), "the product is not good");
	   
	}
	@When("the user  Upload file")
	public void the_user_upload_file() throws InterruptedException {
		
	  send_keys(c.getUpload_File(),"C:\\Users\\sathe\\OneDrive\\Pictures\\Screenshots//Screenshot 2024-04-09 114504.png");
	   sleep(5000);
	}
	@When("the user  Click Submit button")
	public void the_user_click_submit_button() {
	  click(c.getSubmit_Button());
	   
	}
	@When("the user Click OK button")
	public void the_user_click_ok_button() {
	  alert_Accept();
	   
	}
	@Then("the user Verify success message Success! Your details have been submitted successfully is visible")
	public void the_user_verify_success_message_success_your_details_have_been_submitted_successfully_is_visible() {
	  Assert.assertTrue("Success message",c.getSubmitted_successfully().isDisplayed());
	   
	}
	@Then("the user  Click Home button")
	public void the_user_click_home_button() {
	  click(c.getReturn_HomePage());
	   
	}
	@Then("the user verify that landed to home page successfully")
	public void the_user_verify_that_landed_to_home_page_successfully() {
		 Assert.assertTrue("Home page is visible",c.getHome_page().isDisplayed());
	   
	}


}
