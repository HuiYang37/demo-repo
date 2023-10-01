package cucumber_hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.DriverFactory;

public class UI_Hook {

	@Before("@ui")
	public void setup() {
		DriverFactory.initDriver();
		System.out.println("Scenario starts...");
	}

	@After("@ui")
	public void cleanup() {
		DriverFactory.resetDriver();
		System.out.println("Scenario ends");
	}
}
