package Org.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {
	
	private WebDriver driver;
	
	@FindBy (xpath = "//a[text()=' Home']")
	private WebElement Home_page;
	
	@FindBy (xpath = "//a[text()=' Signup / Login']")
	private WebElement signup_login;
	
	@FindBy (xpath = "//h2[text()='New User Signup!']")
	private WebElement New_User_Signup;
	
	@FindBy (xpath ="//input[@name='name']")
	private WebElement Enter_signup_name;
	
	@FindBy (xpath = "(//input[@name='email'])[2]")
	private WebElement Enter_signup_email;
	
	@FindBy (xpath = "//button[text()='Signup']")
	private WebElement signup_Button;
	
	@FindBy (xpath = "//b[text()='Enter Account Information']")
	private WebElement Enter_Account_Information;
	
	@FindBy (xpath ="//input[@id='id_gender1']")
	private WebElement title;
	
	@FindBy (xpath ="//input[@id='password']")
	private WebElement Password;
	
	@FindBy (xpath ="//select[@id='days']")
	private WebElement DateOfBirth_Days;
	
	@FindBy (xpath ="//select[@id='months']")
	private WebElement DateOfBirth_Months;
	
	@FindBy (xpath ="//select[@id='years']")
	private WebElement DateOfBirth_Years;
	
	@FindBy (xpath ="//input[@id='newsletter']")
	private WebElement Our_Newsletter;
	
	@FindBy (xpath = "//input[@id='optin']")
	private WebElement Our_partner;
	
	@FindBy (xpath = "//input[@id='first_name']")
	private WebElement First_name;
	
	@FindBy (xpath = "//input[@id='last_name']")
	private WebElement Last_name;
	
	@FindBy (xpath = "//input[@id='company']")
	private WebElement Company_name;
	
	@FindBy (xpath = "//input[@id='address1']")
	private WebElement Address1;
	
	@FindBy (xpath = "//input[@id='address2']")
	private WebElement Address2;
	
	@FindBy (xpath = "//select[@id='country']")
	private WebElement Country;
	
	@FindBy (xpath = "//input[@id='state']")
	private WebElement State;
	
	@FindBy (xpath = "//input[@id='city']")
	private WebElement City;
	
	@FindBy (xpath = "//input[@id='zipcode']")
	private WebElement Zipcode;
	
	@FindBy (xpath = "//button[text()='Create Account']")
	private WebElement Create_Account_Button;
	
	@FindBy (xpath = "//input[@id='mobile_number']")
	private WebElement Mobile_number;
	
	@FindBy (xpath = "//b[text()='Account Created!']")
	private WebElement Account_Created;
	
	@FindBy (xpath = "//a[text()='Continue']")
	private WebElement Continue;
	
	@FindBy (xpath = "//b[text()='satheshkumar']")
	private WebElement Logged_username;
	
	@FindBy (xpath = "//a[text()=' Delete Account']")
	private WebElement Delete_account;
	
	@FindBy (xpath = "//b[text()='Account Deleted!']")
	private WebElement Account_Deleted;
	
	@FindBy (xpath = "//a[text()='Continue']")
	private WebElement Final_Continue;
	
	public SignUp (WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getHome_page() {
		return Home_page;
	}

	public WebElement getSignup_login() {
		return signup_login;
	}

	public WebElement getNew_User_Signup() {
		return New_User_Signup;
	}

	public WebElement getEnter_signup_name() {
		return Enter_signup_name;
	}

	public WebElement getEnter_signup_email() {
		return Enter_signup_email;
	}

	public WebElement getSignup_Button() {
		return signup_Button;
	}

	public WebElement getEnter_Account_Information() {
		return Enter_Account_Information;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getDateOfBirth_Days() {
		return DateOfBirth_Days;
	}

	public WebElement getDateOfBirth_Months() {
		return DateOfBirth_Months;
	}

	public WebElement getDateOfBirth_Years() {
		return DateOfBirth_Years;
	}

	public WebElement getOur_Newsletter() {
		return Our_Newsletter;
	}

	public WebElement getOur_partner() {
		return Our_partner;
	}

	public WebElement getFirst_name() {
		return First_name;
	}

	public WebElement getLast_name() {
		return Last_name;
	}

	public WebElement getCompany_name() {
		return Company_name;
	}

	public WebElement getAddress1() {
		return Address1;
	}

	public WebElement getAddress2() {
		return Address2;
	}

	public WebElement getCountry() {
		return Country;
	}

	public WebElement getState() {
		return State;
	}

	public WebElement getCity() {
		return City;
	}

	public WebElement getZipcode() {
		return Zipcode;
	}

	public WebElement getCreate_Account_Button() {
		return Create_Account_Button;
	}

	public WebElement getMobile_number() {
		return Mobile_number;
	}

	public WebElement getAccount_Created() {
		return Account_Created;
	}

	public WebElement getContinue() {
		return Continue;
	}

	public WebElement getLogged_username() {
		return Logged_username;
	}

	public WebElement getDelete_account() {
		return Delete_account;
	}

	public WebElement getAccount_Deleted() {
		return Account_Deleted;
	}

	public WebElement getFinal_Continue() {
		return Final_Continue;
	}


}
