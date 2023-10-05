package test_ng_ui_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

import utilities.ConfigReader;
import utilities.SeleniumService;

public class BrowserTest {

	private WebDriver driver;
	private SeleniumService ss = new SeleniumService();

	@Test
	void operaTest() {
		System.setProperty("webdriver.opera.driver", "./src/test/resources/drivers/operadriver/operadriver.exe");
		driver = new OperaDriver();
		driver.manage().window().maximize();
		driver.get(ConfigReader.getURL());
		ss.pause(3);
		ss.alwaysQuit(driver);
	}

	@Test
	void firefoxTest() {
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/drivers/firefoxdriver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(ConfigReader.getURL());
		ss.pause(3);
		ss.alwaysQuit(driver);
	}

}
