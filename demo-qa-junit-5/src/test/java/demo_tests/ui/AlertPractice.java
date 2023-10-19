package demo_tests.ui;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AlertPractice extends ChromeBaseTest {

	@Test
	void alertTest() {
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		Alert alert = sj.justWait().until(ExpectedConditions.alertIsPresent());
		alert.accept();
		System.out.println("Test passed.");
	}

	@Test
	void alertInputTest() {
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("promtButton")).click();
		sj.justWait().until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Joe");
		alert.accept();
		WebElement promptResult = sj.justWait()
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("promptResult")));
		String successText = promptResult.getText();
		assertEquals("You entered Jake", successText);
		System.out.println("Test passed.");
	}

	@Test
	void modalTest() {
		driver.get("https://demoqa.com/modal-dialogs");
		driver.findElement(By.id("showSmallModal")).click();
		sj.justWait().until(ExpectedConditions.visibilityOfElementLocated(By.id("closeSmallModal"))).click();
		System.out.println("Test passed.");
	}

}
