package cucumber.hooks.ui;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.ConfigReader;
import utilities.DriverFactory;
import utilities.SeleniumJob;

public class Hooks {

	WebDriver driver;
	SeleniumJob sj;

	@Before("@ui")
	public void setup() {
		DriverFactory.initDriver();
		driver = DriverFactory.getDriver();
		sj = new SeleniumJob(driver);
	}

	@After("@ui")
	public void cleanup() {
		DriverFactory.resetDriver();
	}

	@AfterStep()
	public void onFailed(Scenario scenario) {
		ConfigReader.load();
		boolean isScreenshotModeOn = Boolean.valueOf(ConfigReader.get("screenshot"));
		if (scenario.isFailed() && isScreenshotModeOn) {
			sj.takeScreenshotOnFailed(scenario);
		}
	}

}
