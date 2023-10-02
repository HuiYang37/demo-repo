package cucumber_hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.DriverFactory;

public class UI_Hooks {

	@Before("@ui")
	public void setup() {
		DriverFactory.initDriver();
		System.out.println("Scenario starts...");
		System.out.println("Thread ID => " + Thread.currentThread().getId());
	}

	@After("@ui")
	public void cleanup() {
		DriverFactory.resetDriver();
		System.out.println("Thread ID => " + Thread.currentThread().getId());
		System.out.println("Scenario ends");
	}
}
