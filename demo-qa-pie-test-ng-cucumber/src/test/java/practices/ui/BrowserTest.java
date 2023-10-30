package practices.ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utilities.SeleniumService;
import utilities.TestUtils;

public class BrowserTest {

	private WebDriver driver;
	String url = "https://www.usaa.com/";

	@Test
	void operaTest() {
		System.setProperty("webdriver.opera.driver", "./src/test/resources/drivers/operadriver/operadriver.exe");
		driver = new OperaDriver();
		SeleniumService.configDriver(driver);
		driver.get(url);

		By mainJoinButtonLocator = By.cssSelector("[data-testid='header-card-button']");
		@SuppressWarnings("unused")
		By joinButtonLocator = By.linkText("JOIN USAA");
		driver.findElement(By.xpath("//a[text()='Membership']")).click();
		List<WebElement> joinElements = driver.findElements(mainJoinButtonLocator);
		System.out.println("Total <Join> buttons: " + joinElements.size());
		System.out.println(driver.getTitle());
		System.out.println("Test passed.");
		TestUtils.pause(1);
	}

	@Test
	void firefoxTest() {
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/drivers/firefoxdriver/geckodriver.exe");
		driver = new FirefoxDriver();
		SeleniumService.configDriver(driver);
		driver.get(url);

		driver.findElement(By.xpath("//a[text()='Membership']")).click();
		By joinButtonLocator = By.xpath("//a[text()='JOIN USAA']");
		List<WebElement> joinElements = driver.findElements(joinButtonLocator);
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
