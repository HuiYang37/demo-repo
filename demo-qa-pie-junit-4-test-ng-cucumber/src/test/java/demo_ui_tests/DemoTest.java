package demo_ui_tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import utilities.ConfigReader;
import utilities.DriverFactory;
import utilities.SeleniumServices;

public class DemoTest {

	private WebDriver driver;
	private SeleniumServices ss;

	@Test
	public void homePageTest() {
		try {
			driver.get(ConfigReader.getURL());
			ss.pause(3);
			ss.alwaysQuit(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Before
	public void setup() {
		try {
			driver = DriverFactory.getDriver(ConfigReader.getBrowserName());
			ss = new SeleniumServices();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@After
	public void cleanup() {
		DriverFactory.resetDriver();
	}

}
