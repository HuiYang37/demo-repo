package practices.ui;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import tests.ui.ChromeBaseTestWithReports;

public class SeleniumExceptionsTest extends ChromeBaseTestWithReports {

	@Test
	void runElementClickInterceptedExceptionTest() {
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement submitButton = driver.findElement(By.id("submit"));
		Assertions.assertThrows(ElementClickInterceptedException.class, () -> submitButton.click());
	}

	@Test
	void runNoSuchElementExceptionTest() {
		driver.get("https://demoqa.com/automation-practice-form");
		Assertions.assertThrows(NoSuchElementException.class,
				() -> driver.findElement(By.id("email")).sendKeys("jack.smith@demo-email.com"));
	}

	@Test
	void runTimeoutExceptionTest() {
		driver.get("https://demoqa.com/radio-button");
		WebElement yesInput = driver.findElement(By.id("yesRadio"));
		sj.mouse().moveToElement(yesInput).click().build().perform();
		Assertions.assertThrows(TimeoutException.class, () -> sj.getWait().until(ExpectedConditions.alertIsPresent()));
	}

	@Test
	void runElementNotInteractableExceptionTest() {
		driver.get("https://jqueryui.com/menu/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		By menuItem = By.xpath("//ul[@id='menu']/li[@class='ui-menu-item']//div[text()='Pop']");
		Assertions.assertThrows(ElementNotInteractableException.class, () -> sj.mouse()
				.moveToElement(driver.findElement(menuItem)).pause(Duration.ofSeconds(1)).build().perform());
	}

}
