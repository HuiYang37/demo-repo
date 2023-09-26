package demo_tests.ui;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.DriverFactory;
import utilities.SeleniumServices;

public class SeleniumFirstTest {

	@Test
	void openDMV() {
		WebDriver driver = DriverFactory.getChrome();
		SeleniumServices ss = new SeleniumServices();
		driver.get("https://www.dmv.virginia.gov/");
		driver.findElement(By.xpath("//nav//a[@href='/locations']")).click();
		ss.pause(3);

		System.out.println("Yay!");

		ss.alwaysQuit(driver);
	}

}
