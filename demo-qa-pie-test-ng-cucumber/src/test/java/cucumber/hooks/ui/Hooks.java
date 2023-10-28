package cucumber.hooks.ui;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
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

	@AfterStep("@stop")
	public void didStepfail(Scenario scenario) {
		if (scenario.isFailed()) {
			sj.takeScreenshot(scenario);
		}
	}

}
