package Org.StepDefinition21;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Org.Base_Class.Base_ClassPoc;
import Org.Pom.ContactUs_Pom;
import Org.Pom.Testcase14upto;
import Org.Runner_Class.Runner_Poc;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddReview extends Base_ClassPoc {
	
public static WebDriver driver = Runner_Poc.driver;
	
	public static ContactUs_Pom c = new ContactUs_Pom(driver);
	public static Testcase14upto d = new Testcase14upto(driver);
	
	@Given("the user Launch URL")
	public void the_user_launch_url() {
		geturl("https://automationexercise.com");       
	   
	}
	@When("the user Click on Products button")
	public void the_user_click_on_products_button() {
		 click(c.getProduct_Click());
	   
	}
	@Then("the user Verify user is navigated to ALL PRODUCTS page successfully")
	public void the_user_verify_user_is_navigated_to_all_products_page_successfully() {
		 Assert.assertTrue("all product page is visible",c.getALL_Product_visible().isDisplayed());
	   
	}
	@When("the user Click on View Product button")
	public void the_user_click_on_view_product_button() {
	    click(c.getView_product());
	   
	}
	@Then("the user Verify Write Your Review is visible")
	public void the_user_verify_write_your_review_is_visible() {
	    Assert.assertTrue("write your review is visible",d.getWrite_Review_dis().isDisplayed());
	   
	}
	@When("the user Enter name, email and review")
	public void the_user_enter_name_email_and_review() {
	    send_keys(d.getName_Input(), "Sathesh");
	    send_keys(d.getEmail_input(), "Sathesh@gmail.com");
	    send_keys(d.getReview_input(), "the product is good");
	   
	}
	@When("the user Click Submit button")
	public void the_user_click_submit_button() {
	    click(d.getSubmit_Review());
	   
	}
	@Then("the user Verify success message Thank you for your review.")
	public void the_user_verify_success_message_thank_you_for_your_review() {
	    String text = d.getThanks_Review().getText();
	    String actual= "Thank you for your review.";
	    Assert.assertEquals(" thanks for your review ",actual ,text);
	   
	}


}
