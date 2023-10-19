package practices.ui;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import tests.ui.ChromeBaseTest;

public class AlertPractice extends ChromeBaseTest {

	@Test()
	@Order(0)
	void alertTest() {
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		Alert alert = sj.stayPut().until(ExpectedConditions.alertIsPresent());
		alert.accept();
		System.out.println("Test passed.");
	}

	@Test
	@Order(1)
	void alertInputTest() {
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("promtButton")).click();
		sj.stayPut().until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Joe");
		alert.accept();
		WebElement promptResult = sj.stayPut()
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("promptResult")));
		String successText = promptResult.getText();
		assertEquals("You entered Jake", successText);
		System.out.println("Test passed.");
	}

	@Test
	@Order(2)
	void modalTest() {
		driver.get("https://demoqa.com/modal-dialogs");
		driver.findElement(By.id("showSmallModal")).click();
		sj.stayPut().until(ExpectedConditions.visibilityOfElementLocated(By.id("closeSmallModal"))).click();
		System.out.println("Test passed.");
	}

}
