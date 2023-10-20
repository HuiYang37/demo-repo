package tests.ui;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.openqa.selenium.WebDriver;

import utilities.DriverManager;
import utilities.SeleniumJob;
import utilities.readers.ConfigReader;

public class BaseTest {

	protected WebDriver driver;
	protected SeleniumJob sj;

	@BeforeEach
	@Tag("ui")
	void setup() {
		DriverManager.initManager(ConfigReader.getBrowserName());
		driver = DriverManager.getDriver();
		sj = new SeleniumJob(driver);
	}

	@AfterEach
	@Tag("ui")
	void cleanup() {
		DriverManager.resetManager();
	}

}
