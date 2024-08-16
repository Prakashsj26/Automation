package Org.StepDefinition18;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Org.Base_Class.Base_ClassPoc;
import Org.Pom.ContactUs_Pom;
import Org.Pom.Testcase14upto;
import Org.Runner_Class.Runner_Poc;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewCategory extends Base_ClassPoc {
	
	public static WebDriver driver = Runner_Poc.driver;
	
	public static ContactUs_Pom c = new ContactUs_Pom(driver);
	public static Testcase14upto d = new Testcase14upto(driver);
	
	
	@Given("the user Launch Url")
	public void the_user_launch_url() {
		geturl("https://automationexercise.com");   
	   
	}
	@Then("the user Verify that categories are visible on left side bar")
	public void the_user_verify_that_categories_are_visible_on_left_side_bar() {
		scrollIntoView(d.getCategory_Visible());
	    Assert.assertTrue("Category is visible",d.getCategory_Visible().isDisplayed());
	   
	}
	@When("the user Click on Women category")
	public void the_user_click_on_women_category() throws InterruptedException {
	    click(d.getWomen_Bt_Click());
	    sleep(3000);
	   
	}
	@When("the user Click on any category link under Women category, for example: Dress")
	public void the_user_click_on_any_category_link_under_women_category_for_example_dress() {
	    click(d.getWomentops_bt_click());
	   
	}
	@Then("the user Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS")
	public void the_user_verify_that_category_page_is_displayed_and_confirm_text_women_tops_products() {
	    
	   
	}
	@When("the user On left side bar, click on any sub-category link of Men category")
	public void the_user_on_left_side_bar_click_on_any_sub_category_link_of_men_category() {
	    click(d.getMen_bt_click());
	    click(d.getTshirt_Bt_Click());
	   
	}
	@Then("the user Verify that user is navigated to that category page")
	public void the_user_verify_that_user_is_navigated_to_that_category_page() throws InterruptedException {
		sleep(3000);
	    Assert.assertTrue("mens product page is visible",d.getTshirt_Product_Visible().isDisplayed());
	   
	}

}
