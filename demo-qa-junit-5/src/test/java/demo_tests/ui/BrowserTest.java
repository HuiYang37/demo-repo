package demo_tests.ui;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.DriverFactory;
import utilities.TestUtils;
import utilities.file_readers.ConfigReader;

public class BrowserTest {

	private WebDriver driver;
	private String url;

	@Test
	void chromeTest() {
		url = ConfigReader.loadProperties("demo").getProperty("url");
		driver = DriverFactory.getChrome();
		driver.get(url);
		driver.findElement(By.xpath("//a[text()='Membership']")).click();
		TestUtils.pause(2);
		List<WebElement> joinElements = driver.findElements(By.xpath("//a[text()='Join USAA']"));
		System.out.println("Total <Join> buttons: " + joinElements.size());
		System.out.println(driver.getTitle());
		System.out.println("Test passed.");
	}

	@Test
	void edgeTest() {
		url = ConfigReader.loadProperties("demo").getProperty("url");
		driver = DriverFactory.getEdge();
		driver.get(url);
		driver.findElement(By.xpath("//a[text()='Membership']")).click();
		TestUtils.pause(2);
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
