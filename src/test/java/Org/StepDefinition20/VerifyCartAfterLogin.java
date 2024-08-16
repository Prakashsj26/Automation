package Org.StepDefinition20;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Org.Base_Class.Base_ClassPoc;
import Org.Pom.ContactUs_Pom;
import Org.Pom.LoginUser_Pom;
import Org.Pom.Testcase14upto;
import Org.Runner_Class.Runner_Poc;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyCartAfterLogin extends Base_ClassPoc  {
	
public static WebDriver driver = Runner_Poc.driver;
    public static LoginUser_Pom b= new LoginUser_Pom(driver);
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
	@When("the user Enter product name in search input and click search button")
	public void the_user_enter_product_name_in_search_input_and_click_search_button() {
		scrollIntoView(c.getSearch_box());
		 send_keys(c.getSearch_box(),"Top");
		  click(c.getSearch_Button());
	
	}
	@When("the user Verify SEARCHED PRODUCTS is visible")
	public void the_user_verify_searched_products_is_visible() {
		
		Assert.assertTrue("Searched product is visible",c.getSearched_product_visible().isDisplayed());
	
	}
	@Then("the user Verify all the products related to search are visible")
	public void the_user_verify_all_the_products_related_to_search_are_visible() {
		
			
	}
	@When("the user Add those products to cart")
	public void the_user_add_those_products_to_cart() throws InterruptedException {
      
		click(c.getAdd_Cart_Hover1());
		sleep(3000);
		click(c.getContinue_shopping());
		click(c.getAdd_Cart_Hover2());
		sleep(3000);
		click(c.getContinue_shopping());
	}
	@When("the user Click Cart button and")
	public void the_user_click_cart_button_and() {
	    click(c.getCart_click());
	
	}
	@Then("the user verify that products are visible in cart")
	public void the_user_verify_that_products_are_visible_in_cart() {
	    Assert.assertTrue("product is visible",c.getBlue_Top_Nmae().isDisplayed());
	    Assert.assertTrue("product is displayed",c.getTop_name().isDisplayed());
	
	}
	@When("the user Click Signup - Login button and submit login details")
	public void the_user_click_signup_login_button_and_submit_login_details() {
		click(b.getSignup_login());
		send_keys(b.getEnter_login_Email(),"Satheshkmr25@gmail.com");
		  send_keys(b.getEnter_Login_Password(),"Sathesh@123");
	
	}
	@When("the user Again, go to Cart page")
	public void the_user_again_go_to_cart_page() {
		 click(c.getCart_click());
	
	}
	@Then("the user Verify that those products are visible in cart after login as well")
	public void the_user_verify_that_those_products_are_visible_in_cart_after_login_as_well() {
		  Assert.assertTrue("product is visible",c.getBlue_Top_Nmae().isDisplayed());
		    Assert.assertTrue("product is displayed",c.getTop_name().isDisplayed());
	
	}


}
