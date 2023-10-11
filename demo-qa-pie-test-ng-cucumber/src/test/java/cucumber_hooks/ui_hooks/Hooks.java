package cucumber_hooks.ui_hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.DriverFactory;

public class Hooks {

	@Before("@ui")
	public void setup() {
		DriverFactory.initDriver();
	}

	@After("@ui")
	public void cleanup() {
		DriverFactory.resetDriver();
	}

}
