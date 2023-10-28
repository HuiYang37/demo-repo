package tests.ui;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import utilities.TestUtils;

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

//	void closeGooglePrompt() {
//		try {
//			By locator = By.id("close");
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//			wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).click();
//		} catch (TimeoutException e) {
//			System.out.println("Failed to close googel prompt.");
//			System.out.println(e);
//		}
//	}

}
