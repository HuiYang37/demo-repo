package test_ng_ui_tests_with_pom.com.usaa;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.ConfigReader;
import utilities.DriverFactory;
import utilities.SeleniumService;

public abstract class TestConfig {

	public WebDriver driver;
	public SeleniumService ss;

	@BeforeMethod(groups = { "ui" })
	public void setup() {
		driver = DriverFactory.getDriver();
		ss = new SeleniumService();
		Properties p = ConfigReader.loadProperties("insurance");
		driver.get(p.getProperty("url"));
	}

	@AfterMethod(groups = { "ui" })
	public void cleanup() {
		DriverFactory.resetDriver();
	}

}
