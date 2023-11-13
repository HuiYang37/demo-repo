package practices.ui;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import tests.ui.ChromeBaseTestWithReports;

@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
@Tag("ui")
public class AlertPracticeTest extends ChromeBaseTestWithReports {

	@Test()
	@Order(0)
	void alertTest() {
		System.out.println(0);
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		Alert alert = sj.getWait().until(ExpectedConditions.alertIsPresent());
		alert.accept();
	}

	@Test
	@Order(1)
	void alertInputTest() {
		System.out.println(1);
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("promtButton")).click();
		sj.getWait().until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Joe");
		alert.accept();
		WebElement promptResult = sj.getWait()
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("promptResult")));
		String successText = promptResult.getText();
		assertEquals("You entered Jake", successText);
	}

	@Test
	@Order(2)
	void modalTest() {
		System.out.println(2);
		driver.get("https://demoqa.com/modal-dialogs");
		driver.findElement(By.id("showSmallModal")).click();
		sj.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.id("closeSmallModal"))).click();
	}

}
