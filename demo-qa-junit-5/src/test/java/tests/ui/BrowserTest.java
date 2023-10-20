package tests.ui;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumService;
import utilities.TestUtils;
import utilities.readers.ConfigReader;

public class BrowserTest {

	private WebDriver driver;
	private String url;

	@ParameterizedTest
	@ValueSource(strings = { "chrome", "edge" })
	void runtTest(String browserName) {
		driver = SeleniumService.findDriver(browserName);
		url = ConfigReader.load("demo").getProperty("url");
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
