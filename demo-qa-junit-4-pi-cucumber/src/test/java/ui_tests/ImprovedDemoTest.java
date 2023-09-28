package ui_tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.DriverFactory;
import utilities.SeleniumServices;

public class ImprovedDemoTest {

	@Test
	public void runTest() {
		WebDriver driver = DriverFactory.getChrome();
		SeleniumServices ss = new SeleniumServices();
		driver.get("https://www.dmv.virginia.gov/");
		ss.pause(3);
		driver.findElement(By.xpath("//nav//a[@href='/locations']")).click();
		ss.pause(3);

		System.out.println("Yay!");

		ss.alwaysQuit(driver);
	}

}
