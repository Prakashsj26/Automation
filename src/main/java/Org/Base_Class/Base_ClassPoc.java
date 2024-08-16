package Org.Base_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.description.ModifierReviewable.OfAbstraction;

public class Base_ClassPoc {
	

		
			public static WebDriver driver;

			public static WebDriver  launch_browser() {
				WebDriver driver = new ChromeDriver();
				return driver;
			}

			public static void TakeScreenshot(String path) throws IOException {

				TakesScreenshot ts =(TakesScreenshot)driver;
				File n= ts.getScreenshotAs(OutputType.FILE);
				File f = new File(path);
				FileUtils.copyFile(n, f);



			}		
			public static void geturl(String path) {

				driver.get(path);
			}

			public static void maximize(WebDriver driver) {
				driver.manage().window().maximize();

			}

			public static void implicitly_waits(int value) {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(value));
			}

			public static void clear(WebElement element) {
				element.clear();

			}
			public static void sleep(int num) throws InterruptedException {

				Thread.sleep(num);
			}

			public static void move_To_Element(WebElement element) {
				Actions A = new Actions(driver);
				A.moveToElement(element).build().perform();		
			}

			public static void action_click (WebElement element) {
				Actions A = new Actions(driver);
				A.click(element).build().perform();
			}
			public static void action_doubleclick (WebElement element) {
				Actions A = new Actions(driver);
				A.doubleClick(element).build().perform();		
			}

			public static void send_keys (WebElement element,String String ) {
				element.sendKeys(String);

			}
			
			public static void gettext(WebElement element) {

				element.getText();
			}


			public static void isdisplayed(WebElement element) {
				isdisplayed(element);
			}


			public static void click(WebElement element) {
				element.click();

			}
			public static void select_By_index(WebElement element,int index) {
				Select s = new Select(element);
				s.selectByIndex(index);
			}
			public static void select_By_value(WebElement element,String value) {
				Select s = new Select(element);
				s.selectByValue(value);
			}
			public static void select_By_visibletext(WebElement element,String text) {
				Select s = new Select(element);
				s.selectByVisibleText(text);
			}

			
			public void scrollIntoView(WebElement element) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true);", element);
			}
			public static void alert_Accept() {
				Alert alert =driver.switchTo().alert();
				alert.accept();
			}
			public static void alert_dismiss() {
				Alert alert =driver.switchTo().alert();
				alert.dismiss();
			}
			
			public static void alert_gettext() {
				Alert alert =driver.switchTo().alert();
				alert.getText();
			}
			public static void switch_frame(WebElement element) {
				WebDriver frame =driver.switchTo().frame(element);
				
			}
			public static void downkey() throws AWTException {
				Robot r=new Robot();
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
			}
			public static void enter_key() throws AWTException {
				Robot r=new Robot();
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
			}
			public static void control_key() throws AWTException {
				Robot r=new Robot();
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
			}

			public static void Explicit_wait(int value) {
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(value));
				wait.until(ExpectedConditions.alertIsPresent());
			}
			
		}


