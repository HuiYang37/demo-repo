package junit.ui.tests.pom;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import utilities.DriverFactory;
import utilities.SeleniumJob;

public class BaseTest {

	public WebDriver driver;
	public SeleniumJob sj;

	@Before
	public void setup() {
		DriverFactory.initDriver("chrome");
		driver = DriverFactory.getDriver();
		sj = new SeleniumJob(driver);
	}

	@After
	public void cleanup() {
		DriverFactory.resetDriver();
	}

}
