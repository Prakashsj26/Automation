package Org.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginUser_Pom {
	
	
	@FindBy (xpath = "//a[text()=' Home']")
	private WebElement Home_page;
	
	@FindBy (xpath = "//a[text()=' Signup / Login']")
	private WebElement signup_login;
	
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement Click_Login;
	
	@FindBy(xpath = "//h2[text()='Login to your account']")
	private WebElement Login_Account_Visible;
	
	@FindBy(xpath = "(//input[@name='email'])[1]")
	private WebElement Enter_login_Email;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement Enter_Login_Password;
	
	@FindBy (xpath = "//b[text()='satheshkumar']")
	private WebElement Logged_username;
	
	@FindBy (xpath = "//a[text()=' Delete Account']")
	private WebElement Delete_account;
	
	@FindBy (xpath = "//b[text()='Account Deleted!']")
	private WebElement Account_Deleted;

	private WebDriver driver;
	
	@FindBy(xpath = "//p[text()='Your email or password is incorrect!']")
	private WebElement incorrect;
	
	@FindBy(xpath = "//a[text()=' Logout']")
	private WebElement LogOut_Button;
	
	@FindBy(xpath = "//p[text()='Email Address already exist!']")
	private WebElement Email_Already_Exist;
//	
//	@FindBy(xpath = "")
//	private WebElement
//	
//	@FindBy(xpath = "")
//	private WebElement
//	

	
	public LoginUser_Pom(WebDriver driver1) {
		this.driver =driver1;
		PageFactory.initElements(driver, this);
		
	

	}

	public WebElement getHome_page() {
		return Home_page;
	}

	public WebElement getSignup_login() {
		return signup_login;
	}

	public WebElement getClick_Login() {
		return Click_Login;
	}

	public WebElement getLogin_Account_Visible() {
		return Login_Account_Visible;
	}

	public WebElement getEnter_login_Email() {
		return Enter_login_Email;
	}

	public WebElement getEnter_Login_Password() {
		return Enter_Login_Password;
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

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getIncorrect() {
		return incorrect;
	}

	public WebElement getLogOut_Button() {
		return LogOut_Button;
	}

	public WebElement getEmail_Already_Exist() {
		return Email_Already_Exist;
	}

	
}
