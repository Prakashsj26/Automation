package Org.StepDefinition25;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Org.Base_Class.Base_ClassPoc;
import Org.Pom.ContactUs_Pom;
import Org.Pom.SignUp;
import Org.Pom.Testcase14upto;
import Org.Runner_Class.Runner_Poc;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyArrowButton extends Base_ClassPoc {
	
	public static WebDriver driver = Runner_Poc.driver;

	
	    public static SignUp a = new SignUp(driver);
		public static ContactUs_Pom c = new ContactUs_Pom(driver);
		public static Testcase14upto d = new Testcase14upto(driver);
	
	@Given("the user Launch URL")
	public void the_user_launch_url() {
		 geturl("https://automationexercise.com"); 
	   
	}
	@Then("the user Verify that home page is visible successfully")
	public void the_user_verify_that_home_page_is_visible_successfully() {
		Assert.assertTrue("Homen page is visible ",a.getHome_page().isDisplayed());
	   
	}
	@When("the user Scroll down page to bottom")
	public void the_user_scroll_down_page_to_bottom() {
	   scrollIntoView(c.getSubcription_text());
	   
	}
	@Then("the user Verify SUBSCRIPTION is visible")
	public void the_user_verify_subscription_is_visible() throws InterruptedException {
	   Assert.assertTrue("subscription is visible",c.getSubcription_text().isDisplayed());
	   sleep(3000);
	   
	}
	@When("the user Click on arrow at bottom right side to move upward")
	public void the_user_click_on_arrow_at_bottom_right_side_to_move_upward() {
	   click(d.getScrollUPArrow());
	   
	}
	@Then("the user Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen")
	public void the_user_verify_that_page_is_scrolled_up_and_full_fledged_practice_website_for_automation_engineers_text_is_visible_on_screen() {
		 Assert.assertTrue("Automation engineer text is visible",d.getFull_fledged().isDisplayed());
	   
	}



}
