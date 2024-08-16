package Org.StepDefinition19;

import org.junit.Assert;

import Org.Base_Class.Base_ClassPoc;
import Org.Pom.ContactUs_Pom;
import Org.Pom.SignUp;
import Org.Pom.Testcase14upto;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewCartBrand extends Base_ClassPoc {
	
	public static SignUp a = new SignUp(driver);
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
	@Then("the user Verify that Brands are visible on left side bar")
	public void the_user_verify_that_brands_are_visible_on_left_side_bar() {
	   Assert.assertTrue("Brand is displayed",d.getBrand_bt_click().isDisplayed());
	   
	}
	@When("the user Click on any brand name")
	public void the_user_click_on_any_brand_name() {
	   click(d.getPolo_Brand_click());
	   
	}
	@Then("the user Verify that user is navigated to brand page and brand products are displayed")
	public void the_user_verify_that_user_is_navigated_to_brand_page_and_brand_products_are_displayed() {
	   Assert.assertTrue("polo product is visible",d.getPolo_Brand_Displayed().isDisplayed());
	   
	}
	@When("the user On left side bar, click on any other brand link")
	public void the_user_on_left_side_bar_click_on_any_other_brand_link() {
	   click(d.getHH_Brand_click());
	   
	}
	@Then("the user Verify that user is navigated to that brand page and can see products")
	public void the_user_verify_that_user_is_navigated_to_that_brand_page_and_can_see_products() {
	   Assert.assertTrue("H&H product is displayed",d.getHH_Brand_displayed().isDisplayed());
	   
	}

}
