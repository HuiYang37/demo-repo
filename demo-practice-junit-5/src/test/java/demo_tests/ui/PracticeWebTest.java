package demo_tests.ui;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import utilities.DriverFactory;
import utilities.SeleniumServices;

public class PracticeWebTest {

	@Test
	void run() {
		WebDriver driver = DriverFactory.getChrome();
		driver.get("https://naveenautomationlabs.com/opencart/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		SeleniumServices ss = new SeleniumServices();
		ss.alwaysQuit(driver);
	}

}
