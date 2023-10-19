package cucumber_hooks.ui;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.DriverFactory;
import utilities.SeleniumJob;

public class Hooks {

	WebDriver driver;
	SeleniumJob sj;

	@Before("@ui")
	public void setup() {
		DriverFactory.initDriver("chrome");
		driver = DriverFactory.getDriver();
		sj = new SeleniumJob(driver);
	}

	@After("@ui")
	public void cleanup() {
		DriverFactory.resetDriver();
	}

}
