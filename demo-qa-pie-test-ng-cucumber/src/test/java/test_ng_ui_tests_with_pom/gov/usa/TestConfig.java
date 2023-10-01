package test_ng_ui_tests_with_pom.gov.usa;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.ConfigReader;
import utilities.DriverFactory;
import utilities.SeleniumServices;

public class TestConfig {

	public WebDriver driver;
	public SeleniumServices ss;

	@BeforeMethod
	public void setup() {
		driver = DriverFactory.getDriver();
		ss = new SeleniumServices();
		driver.get(ConfigReader.getURL());
	}

	@AfterMethod
	public void cleanup() {
		DriverFactory.resetDriver();
	}

}
