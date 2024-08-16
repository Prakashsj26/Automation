package Org.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class ContactUs_Pom {
	
	public WebDriver driver;

	@FindBy (xpath = "//a[text()=' Home']")
	private WebElement Home_page;
	
	@FindBy(xpath = " //a[text()=' Contact us']")
	private WebElement ContactUs;
	
	@FindBy(xpath = "//h2[text()='Get In Touch']")
	private WebElement Get_In_Touch_visible;
	
	@FindBy(xpath = "//input[@name='name']")
	private WebElement Enter_Name;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement Enter_Email;
	
	@FindBy(xpath = "//input[@name='subject']")
	private WebElement Enter_Subject; 
	
	@FindBy(xpath = "//textarea[@name='message']")
	private WebElement Enter_Message;
	
	@FindBy(xpath = "//input[@name='upload_file']")
	private WebElement Upload_File;
	
	@FindBy(xpath = "//input[@name='submit']")
	private WebElement Submit_Button;
	
	@FindBy(xpath = "//div[text()='Success! Your details have been submitted successfully.']")
	private WebElement Submitted_successfully;
	
	@FindBy(xpath = "//a[@class='btn btn-success']")
	private WebElement Return_HomePage;
	
	@FindBy(xpath = " //a[text()=' Test Cases']")
	private WebElement Testcase_click;
	
	@FindBy(xpath = " //span[text()='Below is the list of ']")
	private WebElement Testcase_page_visible;
	
	@FindBy(xpath = "//a[text()=' Products']")
	private WebElement Product_Click;
	
	@FindBy(xpath="//h2[text()='All Products']")
	private WebElement ALL_Product_visible;
	
	@FindBy(xpath = "(//div[@class='features_items'])[1]/div[2]/div/div[2]/ul/li/a")
	private WebElement view_product;
	
	@FindBy(xpath="//div[@class='product-information']/h2")
	private WebElement BlueTOP;
	
	@FindBy(xpath="(//div[@class='product-information']/p)[1]")
	private WebElement Category_check;
	
	@FindBy(xpath="//div[@class='product-information']/span/span")
	private WebElement Product_price;
	
	@FindBy(xpath="//div[@class='product-information']//child::b[text()='Availability:']")
	private WebElement Product_Availability;
	
	@FindBy(xpath="//div[@class='product-information']/p[3]/b")
	private WebElement Product_conditions;
	
	@FindBy(xpath="//div[@class='product-information']/p[4]/b")
	private WebElement Product_brand;
	
    @FindBy(xpath = "//input[@id='search_product']")
    private WebElement Search_box;
    
    @FindBy(xpath = "//button[@id='submit_search']")
    private WebElement Search_Button;
    
    @FindBy(xpath = "//h2[text()='Searched Products']")
    private WebElement Searched_product_visible;
    
    @FindBy(xpath = "//h2[text()='Subscription']")
    private WebElement Subcription_text;
    
    @FindBy(xpath = "//input[@id='susbscribe_email']")
    private WebElement susbscribe_email;
    
    @FindBy(xpath = "//button[@id='subscribe']")
    private WebElement Subscribe_button;
    
    @FindBy(xpath = "//div[text()='You have been successfully subscribed!']")
    private WebElement Successfully_Subscribed;
    
    @FindBy(xpath = "//a[text()=' Cart']")
    private WebElement Cart_click;
    
    @FindBy(xpath = "(//div[@class='col-sm-4'])[2]/div/div[1]/div[1]/a")
    private WebElement Add_Cart_Hover1;
    
    @FindBy(xpath = "//button[text()='Continue Shopping']")
    private WebElement Continue_shopping;
    
    @FindBy(xpath = "(//div[@class='col-sm-4'])[3]/div/div[1]/div[1]/a")
    private WebElement Add_Cart_Hover2;
    
    @FindBy(xpath = "//u[text()='View Cart']")
    private WebElement Viewcart;
	
    @FindBy(xpath = "//a[text()='Blue Top']")
    private WebElement product_Check1;
    
    @FindBy(xpath = "//a[text()='Men Tshirt']")
    private WebElement product_Check2;
    
    @FindBy(xpath = "(//td[@class='cart_price'])[1]/p")
    private WebElement price_Check1;
    
    @FindBy(xpath = "(//td[@class='cart_price'])[2]/p")
    private WebElement price_Check2;
    
    @FindBy(xpath = "(//p[@class='cart_total_price'])[1]")
    private WebElement Total_price_Check1;
    
    @FindBy(xpath = "(//p[@class='cart_total_price'])[2]")
    private WebElement Total_price_Check2;
    
    @FindBy(xpath = "//button[@class='btn btn-default cart']")
    private WebElement AddCart;
    
    @FindBy(xpath = "//button[text()='4']")
    private WebElement Quantity4;
    
    @FindBy(xpath = "//a[text()='Blue Top']")
    private WebElement Blue_Top_Nmae;
    
    @FindBy(xpath = "//a[text()='Winter Top']")
    private WebElement top_name;
    
    
	public ContactUs_Pom(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getHome_page() {
		return Home_page;
	}

	public WebElement getContactUs() {
		return ContactUs;
	}

	public WebElement getGet_In_Touch_visible() {
		return Get_In_Touch_visible;
	}

	public WebElement getEnter_Name() {
		return Enter_Name;
	}

	public WebElement getEnter_Email() {
		return Enter_Email;
	}

	public WebElement getEnter_Subject() {
		return Enter_Subject;
	}

	public WebElement getEnter_Message() {
		return Enter_Message;
	}

	public WebElement getUpload_File() {
		return Upload_File;
	}

	public WebElement getSubmit_Button() {
		return Submit_Button;
	}

	public WebElement getSubmitted_successfully() {
		return Submitted_successfully;
	}

	public WebElement getReturn_HomePage() {
		return Return_HomePage;
	}

	public WebElement getTestcase_click() {
		return Testcase_click;
	}

	public WebElement getTestcase_page_visible() {
		return Testcase_page_visible;
	}

	public WebElement getProduct_Click() {
		return Product_Click;
	}

	public WebElement getALL_Product_visible() {
		return ALL_Product_visible;
	}

	public WebElement getView_product() {
		return view_product;
	}

	public WebElement getBlueTOP() {
		return BlueTOP;
	}

	public WebElement getCategory_check() {
		return Category_check;
	}

	public WebElement getProduct_price() {
		return Product_price;
	}

	public WebElement getProduct_Availability() {
		return Product_Availability;
	}

	public WebElement getProduct_conditions() {
		return Product_conditions;
	}

	public WebElement getProduct_brand() {
		return Product_brand;
	}

	public WebElement getSearch_box() {
		return Search_box;
	}

	public WebElement getSearch_Button() {
		return Search_Button;
	}

	public WebElement getSearched_product_visible() {
		return Searched_product_visible;
	}

	public WebElement getSubcription_text() {
		return Subcription_text;
	}

	public WebElement getSusbscribe_email() {
		return susbscribe_email;
	}

	public WebElement getSubscribe_button() {
		return Subscribe_button;
	}

	public WebElement getSuccessfully_Subscribed() {
		return Successfully_Subscribed;
	}

	public WebElement getCart_click() {
		return Cart_click;
	}

	public WebElement getAdd_Cart_Hover1() {
		return Add_Cart_Hover1;
	}

	public WebElement getContinue_shopping() {
		return Continue_shopping;
	}

	public WebElement getAdd_Cart_Hover2() {
		return Add_Cart_Hover2;
	}

	public WebElement getViewcart() {
		return Viewcart;
	}

	public WebElement getProduct_Check1() {
		return product_Check1;
	}

	public WebElement getProduct_Check2() {
		return product_Check2;
	}

	public WebElement getPrice_Check1() {
		return price_Check1;
	}

	public WebElement getPrice_Check2() {
		return price_Check2;
	}

	public WebElement getTotal_price_Check1() {
		return Total_price_Check1;
	}

	public WebElement getTotal_price_Check2() {
		return Total_price_Check2;
	}

	public WebElement getAddCart() {
		return AddCart;
	}

	public WebElement getQuantity4() {
		return Quantity4;
	}

	public WebElement getBlue_Top_Nmae() {
		return Blue_Top_Nmae;
	}

	public WebElement getTop_name() {
		return top_name;
	}
	
}
