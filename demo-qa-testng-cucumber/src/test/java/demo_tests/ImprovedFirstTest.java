package demo_tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.DriverFactory;
import utilities.SeleniumServices;

public class ImprovedFirstTest {

	WebDriver driver;
	SeleniumServices ss;

	@Test
	public void runTest() {
		String url = "https://www.gap.com/";
		driver.get(url);
		ss.justWait().until(ExpectedConditions.urlToBe(url));
		ss.pause(1);

		By promoLocator = By.id("promo-drawer-button");
		WebElement promoButton = ss.getVisibleElement(promoLocator);

		boolean isExpanded = Boolean.valueOf(promoButton.getAttribute("aria-expanded"));
		if (isExpanded)
			ss.click(By.xpath("//button[@aria-label='close the promo drawer']"));
		ss.pause(2);

		System.out.println("Yay!");
	}

	@BeforeMethod
	public void setup() {
		driver = DriverFactory.getDriver("chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		ss = new SeleniumServices(driver);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
