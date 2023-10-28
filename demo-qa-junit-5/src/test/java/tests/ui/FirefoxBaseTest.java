package tests.ui;

import java.io.File;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverService;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;

import utilities.SeleniumJob;
import utilities.SeleniumService;

public class FirefoxBaseTest {

	protected WebDriver driver;
	protected SeleniumJob sj;

	@BeforeEach
	void setup() {
		String firefoxDriverFilePath = "./src/test/resources/drivers/firefoxdriver/geckodriver.exe";
		FirefoxOptions options = new FirefoxOptions();
		FirefoxDriverService service = new GeckoDriverService.Builder()
				.usingDriverExecutable(new File(firefoxDriverFilePath)).build();
		options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		driver = new FirefoxDriver(service, options);
		SeleniumService.configDriver(driver);
		sj = new SeleniumJob(driver);
	}

	@AfterEach
	void cleanup() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println("Something happened after the driver quit.");
		}
	}

}
