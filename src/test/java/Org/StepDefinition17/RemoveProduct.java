package Org.StepDefinition17;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Org.Base_Class.Base_ClassPoc;
import Org.Pom.ContactUs_Pom;
import Org.Pom.Testcase14upto;
import Org.Runner_Class.Runner_Poc;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RemoveProduct extends Base_ClassPoc {
	
	public static WebDriver driver = Runner_Poc.driver;
	
	public static ContactUs_Pom c = new ContactUs_Pom(driver);
	public static Testcase14upto d = new Testcase14upto(driver);
	
	@Given("the user Launch Url")
	public void the_user_launch_url() {
	  
		geturl("https://automationexercise.com");   
	}
	@Then("the user Verify that home page is visible successfully")
	public void the_user_verify_that_home_page_is_visible_successfully() {
	  
		Assert.assertTrue("Home page is visible",d.getHome_page().isDisplayed());  
	}
	@When("the user Add products to cart")
	public void the_user_add_products_to_cart() {
		 click(c.getAdd_Cart_Hover1());
	    
	}
	@When("the use Click Cart button")
	public void the_use_click_cart_button() throws InterruptedException {
		sleep(3000);
		 click(c.getViewcart());
	    
	}
	@Then("the user Verify that cart page is displayed")
	public void the_user_verify_that_cart_page_is_displayed() {
		Assert.assertTrue("cart page is displayed",d.getCartPage_Displayed().isDisplayed());
	    
	}
	@When("the user Click X button corresponding to particular product")
	public void the_user_click_x_button_corresponding_to_particular_product() {
	  click(d.getDelete_Qty());
	    
	}
	@Then("the user Verify that product is removed from the cart")
	public void the_user_verify_that_product_is_removed_from_the_cart() {
	  
	    
	}


}
