package demo_tests.ui;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.DriverFactory;
import utilities.SeleniumJob;
import utilities.file_readers.ConfigReader;

public class BrowserTest {

	private WebDriver driver;
	private String url;
	@SuppressWarnings("unused")
	private SeleniumJob sj;

	@Test
	void chromeTest() {
		url = ConfigReader.loadProperties("demo").getProperty("url");
		driver = DriverFactory.getChrome();
		sj = new SeleniumJob(driver);
		driver.get(url);
		driver.findElement(By.xpath("//a[text()='Membership']")).click();
		List<WebElement> joinElements = driver.findElements(By.xpath("//a[text()='Join USAA']"));
		System.out.println("Total <Join> buttons: " + joinElements.size());
		System.out.println(driver.getTitle());
		System.out.println("Test passed.");
	}

	@Test
	@Disabled("Firefox uses geckodriver, it does not work well with Selenium. New update might be required.")
	void firefoxTest() {
		url = ConfigReader.loadProperties("demo").getProperty("url");
		driver = DriverFactory.getFirefox();
		sj = new SeleniumJob(driver);
		driver.get(url);
		driver.findElement(By.xpath("//a[text()='Membership']")).click();
		List<WebElement> joinElements = driver.findElements(By.xpath("//a[text()='Join USAA']"));
		System.out.println("Total <Join> buttons: " + joinElements.size());
		System.out.println(driver.getTitle());
		System.out.println("Test passed.");
	}

	@Test()
	@Disabled("Issue with Chrome in headless mode.")
	void headlessChromeTest() {
		url = ConfigReader.loadProperties("demo").getProperty("url");
		driver = DriverFactory.getHeadlessChrome();
		sj = new SeleniumJob(driver);
		driver.get(url);
		driver.findElement(By.xpath("//a[text()='Membership']")).click();
		List<WebElement> joinElements = driver.findElements(By.xpath("//a[text()='Join USAA']"));
		System.out.println("Total <Join> buttons: " + joinElements.size());
		System.out.println(driver.getTitle());
		System.out.println("Test passed.");
	}

	@AfterEach
	void tearDown() {
		driver.quit();
	}

}
