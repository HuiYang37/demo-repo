package demo_tests.ui;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.TestUtils;
import utilities.file_readers.ConfigReader;
import utilities.file_readers.SeleniumWork;

public class BrowserTest {

	private WebDriver driver;
	private String url;
	@SuppressWarnings("unused")
	private SeleniumWork sw;

	@Test
	void chromeTest() {
		url = ConfigReader.loadProperties("demo").getProperty("url");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		sw = new SeleniumWork(driver);
		driver.get(url);
		TestUtils.pause(3);
		driver.quit();
		System.out.println("Test passed.");
	}

}
