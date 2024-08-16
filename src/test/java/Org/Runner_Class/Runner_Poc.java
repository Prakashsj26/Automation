package Org.Runner_Class;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import Org.Base_Class.Base_ClassPoc;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Org\\feature\\VerifyScrollUPWithoutArrow_26.feature", glue ="Org.StepDefinition26",
monochrome = true, dryRun = false, plugin = {"pretty","json:json-report/TestCase27.json","html:html-report/TestCase27","junit:junit-report/TestCase27.xml"})

public class Runner_Poc extends Base_ClassPoc {

	@BeforeClass

	public static void start() {

		driver = Base_ClassPoc.launch_browser();
		Base_ClassPoc.maximize(driver);

	}

 @AfterClass
	public static void End() {
		driver.quit();
	}

}
