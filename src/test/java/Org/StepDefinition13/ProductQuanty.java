package Org.StepDefinition13;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Org.Base_Class.Base_ClassPoc;
import Org.Pom.ContactUs_Pom;
import Org.Runner_Class.Runner_Poc;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductQuanty extends Base_ClassPoc {
	
	public static WebDriver driver =Runner_Poc.driver;
	public static ContactUs_Pom c = new ContactUs_Pom(driver);
	
	
	@Given("the user Launch URL")
	public void the_user_launch_url() {
	   
		geturl("https://automationexercise.com"); 
	}
	@Then("the user Verify that home page is visible successfully")
	public void the_user_verify_that_home_page_is_visible_successfully() {
		Assert.assertTrue("Home page is visible",c.getHome_page().isDisplayed());
	   
	}
	@When("the user Click View Product for any product on home page")
	public void the_user_click_view_product_for_any_product_on_home_page() {
	   click(c.getView_product());
	   
	}
	@Then("the user Verify product detail is opened")
	public void the_user_verify_product_detail_is_opened() {
	   Assert.assertTrue("verify product details is opened",c.getBlueTOP().isDisplayed());
	 
	}

	@When("the user Increase quantity to four")
	public void the_user_increase_quantity_to_four() throws InterruptedException {
	    for(int i=1;i<4;i++) {
	    	click(c.getAddCart());
	    	sleep(3000);
	    	click(c.getContinue_shopping());   	
	    }    
	}
	
	@When("the user Click Add to cart button")
	public void the_user_click_add_to_cart_button() throws InterruptedException {
		click(c.getAddCart());
		sleep(3000);
	   
	}
	@When("the user Click View Cart button")
	public void the_user_click_view_cart_button() {
		 click(c.getViewcart());
	   
	}
	@Then("the user Verify that product is displayed in cart page with exact quantity")
	public void the_user_verify_that_product_is_displayed_in_cart_page_with_exact_quantity() {
		 Assert.assertTrue("verify product details is displayed",c.getProduct_Check1().isDisplayed());
		 Assert.assertTrue("verify product detail exact qty",c.getQuantity4().isDisplayed());
	}


}
