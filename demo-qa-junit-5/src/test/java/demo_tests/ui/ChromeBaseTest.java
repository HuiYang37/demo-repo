package demo_tests.ui;

import java.io.File;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import utilities.SeleniumJob;
import utilities.SeleniumService;

public class ChromeBaseTest {

	WebDriver driver;
	SeleniumJob sj;

	@BeforeEach
	void setup() {
		ChromeOptions options = new ChromeOptions();
		ChromeDriverService service = new ChromeDriverService.Builder()
				.usingDriverExecutable(new File("./src/test/resources/drivers/chromedriver/chromedriver.exe")).build();
		options.setBinary("C:\\Automation\\chrome-win64\\chrome.exe");
		driver = new ChromeDriver(service, options);
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
