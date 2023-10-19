package tests.ui;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeBaseTest {

	protected WebDriver driver;

	@BeforeEach
	void setup() {
		ChromeOptions options = new ChromeOptions();
		String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36";
		options.addArguments("--headless");
		options.addArguments("--window-size=1600,900");
		options.addArguments("--user-agent=" + userAgent);
		driver = new ChromeDriver(options);
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
