package ui_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utilities.ConfigReader;
import utilities.TestUtils;

public class BrowserTest {

	private WebDriver driver;

	@Test
	void operaTest() {
		System.setProperty("webdriver.opera.driver", "./src/test/resources/drivers/operadriver/operadriver.exe");
		driver = new OperaDriver();
		driver.manage().window().maximize();
		driver.get(ConfigReader.getURL());
		TestUtils.pause(1);
	}

	@Test
	void firefoxTest() {
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/drivers/firefoxdriver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(ConfigReader.getURL());
		TestUtils.pause(1);
	}

	@AfterMethod
	void endTest() {
		driver.quit();
	}

}
