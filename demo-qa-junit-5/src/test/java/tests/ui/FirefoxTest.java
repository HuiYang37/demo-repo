package tests.ui;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.TestUtils;
import utilities.readers.ConfigReader;

public class FirefoxTest extends FirefoxBaseTest {

	private String url = "https://www.homedepot.com/";

	@Test
	void run() {
		driver.get(url);
		driver.navigate().refresh();
		String storeName = driver.findElement(By.cssSelector(".MyStore__store")).getText();
		System.out.println("Store name: " + storeName);
		TestUtils.pause(3);
		System.out.println(driver.getTitle());
		System.out.println("Test passed.");
	}

	@Test
	void secondTest() {
		ConfigReader.load("demo");
		url = ConfigReader.get("url");

		driver.get(url);
		driver.findElement(By.xpath("//a[text()='Membership']")).click();
		TestUtils.pause(2);
		List<WebElement> joinElements = driver.findElements(By.xpath("//a[text()='JOIN USAA']"));
		System.out.println("Total <Join> buttons: " + joinElements.size());
		System.out.println(driver.getTitle());
	}

}
