package tests.ui;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.openqa.selenium.WebDriver;

import utilities.DriverManager;
import utilities.SeleniumJob;

public class BaseTest {

	protected WebDriver driver;
	protected SeleniumJob sj;

	@BeforeEach
	@Tag("ui")
	void setup() {
		DriverManager.initManager("chrome");
		driver = DriverManager.getInstance();
		sj = new SeleniumJob(driver);
	}

	@AfterEach
	@Tag("ui")
	void cleanup() {
		DriverManager.tearDownDriver();
	}

}
