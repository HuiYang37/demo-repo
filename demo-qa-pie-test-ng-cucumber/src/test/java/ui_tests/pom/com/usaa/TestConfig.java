package ui_tests.pom.com.usaa;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.ConfigReader;
import utilities.DriverFactory;
import utilities.SeleniumJob;

public abstract class TestConfig {

	public WebDriver driver;
	public SeleniumJob sj;

	@BeforeMethod(groups = { "ui" })
	public void setup() {
		DriverFactory.initDriver();
		driver = DriverFactory.getDriver();
		sj = new SeleniumJob(driver);
		Properties p = ConfigReader.loadProperties("insurance");
		driver.get(p.getProperty("url"));
	}

	@AfterMethod(groups = { "ui" })
	public void cleanup() {
		DriverFactory.resetDriver();
	}

}
