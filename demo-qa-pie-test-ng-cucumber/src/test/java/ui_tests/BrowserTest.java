package ui_tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utilities.ConfigReader;
import utilities.SeleniumService;
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
		String url = ConfigReader.loadProperties("demo").getProperty("url");
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/drivers/firefoxdriver/geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setAcceptInsecureCerts(true);
		driver = new FirefoxDriver(options);
		SeleniumService.configDriver(driver);
		driver.get(url);
		driver.findElement(By.xpath("//a[text()='Membership']")).click();
		List<WebElement> joinElements = driver.findElements(By.xpath("//a[text()='Join USAA']"));
		System.out.println("Total <Join> buttons: " + joinElements.size());
		System.out.println(driver.getTitle());
		System.out.println("Test passed.");
		TestUtils.pause(1);
	}

	@AfterMethod
	void endTest() {
		driver.quit();
	}

}
