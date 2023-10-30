package tests.ui.pom.com.usaa;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import utilities.DriverFactory;
import utilities.SeleniumJob;

@Listeners(TestListener.class)
public abstract class TestConfig {

	public WebDriver driver;
	public SeleniumJob sj;

	@BeforeMethod(groups = { "ui" })
	public void setup() {
		DriverFactory.initDriver();
		driver = DriverFactory.getDriver();
		sj = new SeleniumJob(driver);
		driver.get("https://www.usaa.com/");
	}

	@AfterMethod(groups = { "ui" })
	public void cleanup() {
		DriverFactory.resetDriver();
	}

}
