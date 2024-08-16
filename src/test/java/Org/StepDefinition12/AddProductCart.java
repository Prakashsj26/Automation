package Org.StepDefinition12;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Org.Base_Class.Base_ClassPoc;
import Org.Pom.ContactUs_Pom;
import Org.Runner_Class.Runner_Poc;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddProductCart extends Base_ClassPoc {
	
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
	@When("the user Click Products button")
	public void the_user_click_products_button() {
	    click(c.getProduct_Click());
	    
	}
	@When("the user Hover over first product and click Add to cart")
	public void the_user_hover_over_first_product_and_click_add_to_cart() throws InterruptedException {
	    move_To_Element(c.getAdd_Cart_Hover1());
	    action_click(c.getAdd_Cart_Hover1());
	    sleep(3000);
	    
	}
	@When("the user  Click Continue Shopping button")
	public void the_user_click_continue_shopping_button() {
	    click(c.getContinue_shopping());
	    
	}
	@When("the user  Hover over second product and click Add to cart")
	public void the_user_hover_over_second_product_and_click_add_to_cart() throws InterruptedException {
	    move_To_Element(c.getAdd_Cart_Hover2());
	    action_click(c.getAdd_Cart_Hover2());
	    sleep(3000);
	}
	@When("the user Click View Cart button")
	public void the_user_click_view_cart_button() {
	    click(c.getViewcart());
	    
	}
	@Then("the user Verify both products are added to Cart")
	public void the_user_verify_both_products_are_added_to_cart() {
		Assert.assertTrue(" first Product add check ",c.getProduct_Check1().isDisplayed());
		Assert.assertTrue(" second Product add check ",c.getProduct_Check2().isDisplayed());
	    
	    
	}
	@Then("the user  Verify their prices, quantity and total price")
	public void the_user_verify_their_prices_quantity_and_total_price() {
		
	 String text = c.getPrice_Check1().getText();
	 String Replaceprice1 = text.replace("Rs. ","");
	Double d1= Double.parseDouble(Replaceprice1);
	Double t1= 500.00;
	 Assert.assertEquals(d1, t1, d1);
	 
	 String text1= c.getPrice_Check2().getText();
	 String Replaceprice2 = text.replace("Rs. ","");
	 Double d2= Double.parseDouble(Replaceprice2);
	 Double t2=400.00;
	 Assert.assertEquals(d2, t2, d2);
	 
	 String text3 = c.getTotal_price_Check1().getText();
	 String Replaceprice3 = text.replace("Rs. ","");
	 Double d3= Double.parseDouble(Replaceprice3);
	 Assert.assertEquals(d1, d3, d1);
	 
	 
	 String text4 =c.getTotal_price_Check2().getText();
	 String Replaceprice4 = text.replace("Rs. ","");
	 Double d4= Double.parseDouble(Replaceprice4);
	 Assert.assertEquals(d2, d4, d2);
	 
	 
	    
	}



}
