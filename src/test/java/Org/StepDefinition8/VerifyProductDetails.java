package Org.StepDefinition8;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Org.Base_Class.Base_ClassPoc;
import Org.Pom.ContactUs_Pom;
import Org.Runner_Class.Runner_Poc;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyProductDetails extends Base_ClassPoc{
	
public static WebDriver driver =Runner_Poc.driver;
	
	public static ContactUs_Pom c = new ContactUs_Pom(driver);

	
	@Given("the User Launch URL")
	public void the_user_launch_url() {
		 geturl("https://automationexercise.com"); 
	  
	}
	@Then("the user  Verify that home page is visible successfully")
	public void the_user_verify_that_home_page_is_visible_successfully() {
		 Assert.assertTrue("Home page is visible",c.getHome_page().isDisplayed());
	  
	}
	@When("the user  Click on Products button")
	public void the_user_click_on_products_button() {
	    click(c.getProduct_Click());
	  
	}
	@Then("the user  Verify user is navigated to ALL PRODUCTS page successfully")
	public void the_user_verify_user_is_navigated_to_all_products_page_successfully() {
	    Assert.assertTrue("all the product page successfully ",c.getALL_Product_visible().isDisplayed());
	  
	}
	@Then("the user verify The products list is visible")
	public void the_user_verify_the_products_list_is_visible() {
	    
	  
	}
	@When("the user Click on View Product of first product")
	public void the_user_click_on_view_product_of_first_product() {
	    click(c.getView_product());
	  
	}
	@When("the User is landed to product detail page")
	public void the_user_is_landed_to_product_detail_page() {
	    
	  
	}
	@Then("the user  Verify that detail detail is visible: product name, category, price, availability, condition, brand name")
	public void the_user_verify_that_detail_detail_is_visible_product_name_category_price_availability_condition_brand_name() {
		Assert.assertTrue("product name visible",c.getBlueTOP().isDisplayed());
		Assert.assertTrue("Category visible ",c.getCategory_check().isDisplayed());
		Assert.assertTrue("price visible ",c.getProduct_price().isDisplayed());
		Assert.assertTrue("product availability",c.getProduct_Availability().isDisplayed());
		Assert.assertTrue("product condition ",c.getProduct_conditions().isDisplayed());
		Assert.assertTrue("brand name ",c.getProduct_brand().isDisplayed());
	  
	}



}
