package tests.ui;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilities.SeleniumService;
import utilities.TestUtils;
import utilities.readers.ConfigReader;

public class FirefoxTest {

	private WebDriver driver;
	private String url;

	@Test
	@Disabled("To be fixed later: geckodriver not working.")
	void runTest() {
		url = ConfigReader.load("demo").getProperty("url");
		driver = new FirefoxDriver();
		SeleniumService.configDriver(driver);
		driver.get(url);
		driver.findElement(By.xpath("//a[text()='Membership']")).click();
		TestUtils.pause(1);
		List<WebElement> joinElements = driver.findElements(By.xpath("//a[text()='Join USAA']"));
		System.out.println("Total <Join> buttons: " + joinElements.size());
		System.out.println(driver.getTitle());
		System.out.println("Test passed.");
	}

	@AfterEach
	void endTest() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println("Something happened after the driver quit.");
		}
	}

}
