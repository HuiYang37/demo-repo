package tests.ui.pom.gov.usa;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.ConfigReader;
import utilities.DriverFactory;
import utilities.SeleniumJob;

public class BaseTest {

	public WebDriver driver;
	public SeleniumJob sj;

	@BeforeMethod
	public void setup() {
		DriverFactory.initDriver();
		driver = DriverFactory.getDriver();
		sj = new SeleniumJob(driver);
		driver.get(ConfigReader.getURL());
	}

	@AfterMethod
	public void cleanup(ITestResult testResult) {
		if (!testResult.isSuccess())
			sj.takeScreenshotOnFailedTest();
		DriverFactory.resetDriver();
	}

}
