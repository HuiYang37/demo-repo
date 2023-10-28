package practices.ui;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import utilities.SeleniumJob;
import utilities.TestUtils;

public class FindSomething {

	WebDriver driver;
	SeleniumJob sj;

	@BeforeEach
	void setUp() {
		ChromeOptions options = new ChromeOptions();
		String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36";
		options.addArguments("--window-size=1600,900");
		options.addArguments("--user-agent=" + userAgent);
		driver = new ChromeDriver(options);
		sj = new SeleniumJob(driver);
	}

	@Test
	void runTest() {
		driver.get("https://www.totalwine.com/");
		TestUtils.pause(2);
	}
	
	@AfterEach
	void tearDown() {
		driver.quit();
	}

}
