package Org.StepDefinition10;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Org.Base_Class.Base_ClassPoc;
import Org.Pom.ContactUs_Pom;
import Org.Runner_Class.Runner_Poc;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifySubcription extends Base_ClassPoc {
	
	public static WebDriver driver =Runner_Poc.driver;
	public static ContactUs_Pom c = new ContactUs_Pom(driver);
	

@Given("the user  Launch URL")
public void the_user_launch_url() {
  
	 geturl("https://automationexercise.com"); 
}
@Then("the user Verify that home page is visible successfully")
public void the_user_verify_that_home_page_is_visible_successfully() {
  
	Assert.assertTrue("Home page is visible",c.getHome_page().isDisplayed());
}
@When("the user  Scroll down to footer")
public void the_user_scroll_down_to_footer() {
  
    scrollIntoView(c.getSubcription_text());
}
@Then("the user Verify text SUBSCRIPTION")
public void the_user_verify_text_subscription() {
	
String text = c.getSubcription_text().getText();
String text1="SUBSCRIPTION";
Assert.assertEquals(" Verify text 'SUBSCRIPTION'", text, text1);
    
}
@When("the user Enter email address in input and click arrow button")
public void the_user_enter_email_address_in_input_and_click_arrow_button() {
  send_keys(c.getSusbscribe_email(), "Satheshkmr@gmail.com");
  click(c.getSubscribe_button());
    
}
@Then("the user Verify success message You have been successfully subscribed! is visible")
public void the_user_verify_success_message_you_have_been_successfully_subscribed_is_visible() {
   Assert.assertTrue("Successfully subscribed",c.getSuccessfully_Subscribed().isDisplayed());
    
}




}
