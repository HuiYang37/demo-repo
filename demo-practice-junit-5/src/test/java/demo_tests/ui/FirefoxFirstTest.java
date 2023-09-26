package demo_tests.ui;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilities.SeleniumServices;

public class FirefoxFirstTest {

	@Test
	void run() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("washington" + Keys.ENTER);
		SeleniumServices ss = new SeleniumServices();
		ss.pause(3);
		ss.alwaysQuit(driver);
	}

}
