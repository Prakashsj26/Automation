package Org.StepDefinition24;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Org.Base_Class.Base_ClassPoc;
import Org.Pom.ContactUs_Pom;
import Org.Pom.SignUp;
import Org.Pom.Testcase14upto;
import Org.Runner_Class.Runner_Poc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DownloadInvoice extends Base_ClassPoc {
	
	public static WebDriver driver = Runner_Poc.driver;

    public static SignUp a = new SignUp(driver);
	public static ContactUs_Pom c = new ContactUs_Pom(driver);
	public static Testcase14upto d = new Testcase14upto(driver);
	
	@Given("the user Launch URL")
	public void the_user_launch_url() {
		 geturl("https://automationexercise.com"); 
	   
	}
	@Then("the user Verify that home page is visible successfully")
	public void the_user_verify_that_home_page_is_visible_successfully() {
		Assert.assertTrue("Homen page is visible ",a.getHome_page().isDisplayed());
	   
	}
	@When("the user Add products to cart")
	public void the_user_add_products_to_cart() {
		 click(c.getAdd_Cart_Hover1());
	   
	}
	@When("the user Click Cart button")
	public void the_user_click_cart_button() throws InterruptedException {
		sleep(5000);
		  click(c.getViewcart());
	   
	}
	@Then("the user Verify that cart page is displayed")
	public void the_user_verify_that_cart_page_is_displayed() {
		 click(d.getCartPage_Displayed());
	   
	}
	@When("the user Click Proceed To Checkout")
	public void the_user_click_proceed_to_checkout() {
		 click(d.getCheckout());
	   
	}
	@When("the user Click Register - Login button")
	public void the_user_click_register_login_button() {
		click(d.getRegister_Login());
	   
	}
	@When("the user Fill all details in Signup and create account")
	public void the_user_fill_all_details_in_signup_and_create_account() {
		send_keys(a.getEnter_signup_name(), "satheshkumar");
		   send_keys(a.getEnter_signup_email(), "Satheshkmr4@gmail.com");
		   click(a.getSignup_Button());
	       click(a.getTitle());
		   send_keys(a.getPassword(),"Sathesh@123");
		   select_By_index(a.getDateOfBirth_Days(), 28);
		   select_By_index(a.getDateOfBirth_Months(), 1);
		   select_By_index(a.getDateOfBirth_Years(), 29);
		   click(a.getOur_Newsletter());
		   click(a.getOur_partner());
		   send_keys(a.getFirst_name(),"sathesh");
		   send_keys(a.getLast_name(), "kumar");
		   send_keys(a.getCompany_name(),"JIO");
		   send_keys(a.getAddress1(), "67/A TVR Road kenikarai");
		   send_keys(a.getAddress2(),"Mayiladuthurai");
		   send_keys(a.getState(),"Tamilnadu");
		   send_keys(a.getCity(),"Mayiladuthurai");
		   send_keys(a.getZipcode(), "609001");
		   send_keys(a.getMobile_number(), "9043600374");
		   click(a.getCreate_Account_Button());
	   
	}
	@Then("the user Verify ACCOUNT CREATED! and click Continue button")
	public void the_user_verify_account_created_and_click_continue_button() {
		Assert.assertTrue("verify that account created",a.getAccount_Created().isDisplayed());
		click(a.getContinue());
	}
	@Then("the user Verify  Logged in as username at top")
	public void the_user_verify_logged_in_as_username_at_top() {
		Assert.assertTrue("Logged in as username",a.getLogged_username().isDisplayed());
	  
	   
	}
	@And("the user Click Proceed To Checkout button")
	public void the_user_click_proceed_to_checkout_button() {
	   click(c.getCart_click());
	   click(d.getCheckout());
	   
	}
	@Then("the user Verify Address Details and Review Your Order")
	public void the_user_verify_address_details_and_review_your_order() {
	   
	   
	}
	@When("the user Enter description in comment text area and click Place Order")
	public void the_user_enter_description_in_comment_text_area_and_click_place_order() {
	   send_keys(d.getMessage_Box(),"product is good");
	   click(d.getPlaceOrder_Button());
	   
	}
	@When("the user Enter payment details: Name on Card, Card Number, CVC, Expiration date")
	public void the_user_enter_payment_details_name_on_card_card_number_cvc_expiration_date() {
		 send_keys(d.getNameOnCard(),"Sathesh");
		   send_keys(d.getCardNumber(), "1234567890123456");
		   send_keys(d.getCvv(), "123");
		   send_keys(d.getExpirt_Month(), "12");
		   send_keys(d.getExpiry_Year(), "2025");
	   
	}
	@When("the user Click Pay and Confirm Order button")
	public void the_user_click_pay_and_confirm_order_button() {
		click(d.getPay_Confirm_Order());
	   
	}
	@Then("the user Verify success message Your order has been placed successfully!")
	public void the_user_verify_success_message_your_order_has_been_placed_successfully() {
		 Assert.assertTrue("order placed Successfully",d.getOrder_Placed().isDisplayed());
	   
	}
	@When("the user Click Download Invoice button")
	public void the_user_click_download_invoice_button() {
	   
	   
	}
	@Then("the user verify invoice is downloaded successfully.")
	public void the_user_verify_invoice_is_downloaded_successfully() {
	   click(d.getDownload_invoice());
	   
	}
	@When("the user Click Continue button")
	public void the_user_click_continue_button() {
	   click(a.getContinue());
	   
	}
	@When("the user Click Delete Account button")
	public void the_user_click_delete_account_button() {
		click(a.getDelete_account());
	    
	   
	}
	@Then("the user Verify ACCOUNT DELETED! and click Continue button")
	public void the_user_verify_account_deleted_and_click_continue_button() {
		  Assert.assertTrue("Account deleted",a.getAccount_Deleted().isDisplayed());
		  click(a.getFinal_Continue());
	   
	}

}
