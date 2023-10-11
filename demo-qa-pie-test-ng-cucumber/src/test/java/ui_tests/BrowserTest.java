package ui_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utilities.ConfigReader;
import utilities.SeleniumJob;

public class BrowserTest {

	private WebDriver driver;
	private SeleniumJob sj;

	@Test
	void operaTest() {
		System.setProperty("webdriver.opera.driver", "./src/test/resources/drivers/operadriver/operadriver.exe");
		driver = new OperaDriver();
		sj = new SeleniumJob(driver);
		driver.manage().window().maximize();
		driver.get(ConfigReader.getURL());
		sj.pause(2);
	}

	@Test
	void firefoxTest() {
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/drivers/firefoxdriver/geckodriver.exe");
		driver = new FirefoxDriver();
		sj = new SeleniumJob(driver);
		driver.manage().window().maximize();
		driver.get(ConfigReader.getURL());
		sj.pause(2);
	}

	@AfterMethod
	void endTest() {
		driver.quit();
	}

}
