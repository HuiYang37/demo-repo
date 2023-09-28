package demo_tests.ui;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.DriverFactory;
import utilities.SeleniumServices;

public class SeleniumFirstTest {

	@Test
	void openDMV() {
		WebDriver driver = DriverFactory.getChrome();
		SeleniumServices ss = new SeleniumServices();
		driver.get("https://www.usps.com/");
		driver.findElement(By.linkText("Shop")).click();
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.urlContains("/store"));
		driver.findElement(By.linkText("Stamps")).click();
		ss.pause(3);

		System.out.println("Yay!");

		ss.alwaysQuit(driver);
	}

}
