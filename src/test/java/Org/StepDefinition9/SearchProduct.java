package Org.StepDefinition9;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Org.Base_Class.Base_ClassPoc;
import Org.Pom.ContactUs_Pom;
import Org.Pom.LoginUser_Pom;
import Org.Runner_Class.Runner_Poc;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProduct extends Base_ClassPoc {
	
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
	@When("the user Click on Products button")
	public void the_user_click_on_products_button() {
		 click(c.getProduct_Click());
		
	   
	}
	@Then("the user Verify user is navigated to ALL PRODUCTS page successfully")
	public void the_user_verify_user_is_navigated_to_all_products_page_successfully() {
		Assert.assertTrue("all the product page successfully ",c.getALL_Product_visible().isDisplayed());
	   
	}
	@When("the user  Enter product name in search input and click search button")
	public void the_user_enter_product_name_in_search_input_and_click_search_button() {
	  send_keys(c.getSearch_box(),"Dress");
	  click(c.getSearch_Button());
	   
	}
	@Then("the user Verify SEARCHED PRODUCTS is visible")
	public void the_user_verify_searched_products_is_visible() {
	   Assert.assertTrue("Searched product is visible",c.getSearched_product_visible().isDisplayed());
	   
	}
	@Then("the user Verify all the products related to search are visible")
	public void the_user_verify_all_the_products_related_to_search_are_visible() {
	   
	   
	}

	

}
