package junit_ui_tests_with_pom.gov.usa;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import utilities.ConfigReader;
import utilities.DriverFactory;
import utilities.SeleniumServices;

public class BaseTest {

	public WebDriver driver;
	public SeleniumServices ss;

	@Before
	public void setup() {
		try {
			driver = DriverFactory.getDriver(ConfigReader.getBrowserName());
			ss = new SeleniumServices();
			driver.get(ConfigReader.getURL());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@After
	public void cleanup() {
		DriverFactory.resetDriver();
	}

}
