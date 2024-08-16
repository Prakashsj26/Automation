package Org.StepDefinition22;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Org.Base_Class.Base_ClassPoc;
import Org.Pom.ContactUs_Pom;
import Org.Pom.Testcase14upto;
import Org.Runner_Class.Runner_Poc;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartRecommend  extends Base_ClassPoc {
	
public static WebDriver driver = Runner_Poc.driver;
	
	public static ContactUs_Pom c = new ContactUs_Pom(driver);
	public static Testcase14upto d = new Testcase14upto(driver);
	
	@Given("the user Launch URL")
	public void the_user_launch_url() {
		geturl("https://automationexercise.com");         
	    
	}
	@When("the user Scroll to bottom of page")
	public void the_user_scroll_to_bottom_of_page() {
	    scrollIntoView(d.getRecommended_item());
	    
	}
	@Then("the user Verify RECOMMENDED ITEMS are visible")
	public void the_user_verify_recommended_items_are_visible() {
	    Assert.assertTrue("Recommended item or visible",d.getRecommended_item().isDisplayed());
	    
	}
	@When("the user Click on Add To Cart on Recommended product")
	public void the_user_click_on_add_to_cart_on_recommended_product() throws InterruptedException {
		sleep(5000);
	    click(d.getRecommended_Item_add());
	    
	}
	@When("the user Click on View Cart button")
	public void the_user_click_on_view_cart_button() throws InterruptedException {
		sleep(3000);
	    click(d.getRecomm_viewCart());
	    
	}
	@Then("the user Verify that product is displayed in cart page")
	public void the_user_verify_that_product_is_displayed_in_cart_page() {
	    Assert.assertTrue("product is displayed",d.getRecomm_itemDis().isDisplayed());
	    
	}


}
