package demo_junit_ui_tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

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
			ss.pause(1);
			System.out.println("Test passed.");
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
