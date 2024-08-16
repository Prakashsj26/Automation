package Org.Pom;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Testcase14upto {
	
	 public WebDriver driver;
	
	@FindBy (xpath = "//a[text()=' Home']")
	private WebElement Home_page;
	
	@FindBy (xpath = "//li[text()='Shopping Cart']")
	private WebElement CartPage_Displayed;
	
	@FindBy (xpath = "//a[text()='Proceed To Checkout']")
	private WebElement checkout;
	
	@FindBy (xpath = "//u[text()='Register / Login']")
	private WebElement Register_Login;
	
	@FindBy (xpath = "//ul[@id='address_delivery']")
	private WebElement Delivery_Address;
	
	@FindBy (xpath = "//textarea[@name='message']")
	private WebElement Message_Box;
	
	@FindBy (xpath = "//a[text()='Place Order']")
	private WebElement PlaceOrder_Button;
	
	@FindBy (xpath = "//input[@name='name_on_card']")
	private WebElement NameOnCard;
	
	@FindBy (xpath = "//input[@name='card_number']")
	private WebElement CardNumber;
	
	@FindBy (xpath = "//input[@name='cvc']")
	private WebElement Cvv;
	
	@FindBy (xpath = "//input[@name='expiry_month']")
	private WebElement Expirt_Month;
	
	@FindBy (xpath = "//input[@name='expiry_year']")
	private WebElement Expiry_Year;
	
	@FindBy (xpath = "//button[@id='submit']")
	private WebElement Pay_Confirm_Order;
	
	@FindBy (xpath = "//b[text()='Order Placed!']")
	private WebElement Order_Placed;
	
	@FindBy (xpath = "//a[@class='cart_quantity_delete']")
	private WebElement Delete_Qty;
	
	@FindBy (xpath = "//h2[text()='Category']")
	private WebElement Category_Visible;
	
	@FindBy (xpath = "(//span[@class='badge pull-right'][1])[1]")
	private WebElement Women_Bt_Click;
	
	@FindBy (xpath = "//a[text()='Tops ']")
	private WebElement womentops_bt_click;
	
	@FindBy (xpath = "(//span[@class='badge pull-right'])[2]")
	private WebElement Men_bt_click;
	
	@FindBy (xpath = "//a[text()='Tshirts ']")
	private WebElement Tshirt_Bt_Click;
	
	@FindBy (xpath = "//h2[text()='Men - Tshirts Products']")
	private WebElement Tshirt_Product_Visible;
	
	@FindBy (xpath = "//h2[text()='Brands']")
	private WebElement Brand_bt_click;
	
	@FindBy (xpath = "//a[text()='Polo']")
	private WebElement Polo_Brand_click;
	
	@FindBy (xpath = "//h2[text()='Brand - Polo Products']")
	private WebElement Polo_Brand_Displayed;
	
	@FindBy (xpath = "//a[text()='H&M'] ")
	private WebElement HH_Brand_click;
	
	@FindBy (xpath = "//h2[text()='Brand - H&M Products']")
	private WebElement HH_Brand_displayed;
	
	@FindBy (xpath = "//a[text()='Write Your Review']")
	private WebElement Write_Review_dis;
	
	@FindBy (xpath = "//input[@id='name']")
	private WebElement Name_Input;
	
	@FindBy (xpath = "//input[@id='email']")
	private WebElement Email_input;
	
	@FindBy (xpath = "//textarea[@id='review']")
	private WebElement Review_input;
	
	@FindBy (xpath = "//button[@id='button-review']")
	private WebElement submit_Review;
	
	@FindBy (xpath = "//span[text()='Thank you for your review.']")
	private WebElement Thanks_Review;
	
	@FindBy (xpath = "//h2[text()='recommended items']")
	private WebElement recommended_item;
	
	@FindBy (xpath = "//div[@class='carousel-inner']//div[@class=\"product-image-wrapper\"]//p[text()='Blue Top']/..//a[text()='Add to cart']")
	private WebElement Recommended_Item_add;
	
	@FindBy (xpath = "//u[text()='View Cart']")
	private WebElement Recomm_viewCart;
	
	@FindBy (xpath = "//a[text()='Blue Top']")
	private WebElement Recomm_itemDis;
	
	@FindBy (xpath = "//a[text()='Download Invoice']")
	private WebElement Download_invoice;
	
	@FindBy (xpath = "//a[@id='scrollUp']")
	private WebElement ScrollUPArrow;
	
	@FindBy (xpath = "(//h2[contains(text(),'Full-Fledged practice website')])[1]")
	private WebElement Full_fledged;
	
	@FindBy(xpath="//div[@class='col-sm-4']/div/div/div/p") 
	private List<String> all_product;
	
	@FindBy (xpath = "//p[text()='Men > Tshirts']")
	private WebElement tshirt_dis;
	
	public Testcase14upto(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver,this );
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getHome_page() {
		return Home_page;
	}

	public WebElement getCartPage_Displayed() {
		return CartPage_Displayed;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getRegister_Login() {
		return Register_Login;
	}

	public WebElement getDelivery_Address() {
		return Delivery_Address;
	}

	public WebElement getMessage_Box() {
		return Message_Box;
	}

	public WebElement getPlaceOrder_Button() {
		return PlaceOrder_Button;
	}

	public WebElement getNameOnCard() {
		return NameOnCard;
	}

	public WebElement getCardNumber() {
		return CardNumber;
	}

	public WebElement getCvv() {
		return Cvv;
	}

	public WebElement getExpirt_Month() {
		return Expirt_Month;
	}

	public WebElement getExpiry_Year() {
		return Expiry_Year;
	}

	public WebElement getPay_Confirm_Order() {
		return Pay_Confirm_Order;
	}

	public WebElement getOrder_Placed() {
		return Order_Placed;
	}

	public WebElement getDelete_Qty() {
		return Delete_Qty;
	}

	public WebElement getCategory_Visible() {
		return Category_Visible;
	}

	public WebElement getWomen_Bt_Click() {
		return Women_Bt_Click;
	}

	public WebElement getWomentops_bt_click() {
		return womentops_bt_click;
	}

	public WebElement getMen_bt_click() {
		return Men_bt_click;
	}

	public WebElement getTshirt_Bt_Click() {
		return Tshirt_Bt_Click;
	}

	public WebElement getTshirt_Product_Visible() {
		return Tshirt_Product_Visible;
	}

	public WebElement getBrand_bt_click() {
		return Brand_bt_click;
	}

	public WebElement getPolo_Brand_click() {
		return Polo_Brand_click;
	}

	public WebElement getPolo_Brand_Displayed() {
		return Polo_Brand_Displayed;
	}

	public WebElement getHH_Brand_click() {
		return HH_Brand_click;
	}

	public WebElement getHH_Brand_displayed() {
		return HH_Brand_displayed;
	}

	public WebElement getWrite_Review_dis() {
		return Write_Review_dis;
	}

	public WebElement getName_Input() {
		return Name_Input;
	}

	public WebElement getEmail_input() {
		return Email_input;
	}

	public WebElement getReview_input() {
		return Review_input;
	}

	public WebElement getSubmit_Review() {
		return submit_Review;
	}

	public WebElement getThanks_Review() {
		return Thanks_Review;
	}

	public WebElement getRecommended_item() {
		return recommended_item;
	}

	public WebElement getRecommended_Item_add() {
		return Recommended_Item_add;
	}

	public WebElement getRecomm_viewCart() {
		return Recomm_viewCart;
	}

	public WebElement getRecomm_itemDis() {
		return Recomm_itemDis;
	}

	public WebElement getDownload_invoice() {
		return Download_invoice;
	}

	public WebElement getScrollUPArrow() {
		return ScrollUPArrow;
	}

	public WebElement getFull_fledged() {
		return Full_fledged;
	}

	public List<String> getAll_product() {
		return all_product;
	}

	public WebElement getTshirt_dis() {
		return tshirt_dis;
	}

	

}

