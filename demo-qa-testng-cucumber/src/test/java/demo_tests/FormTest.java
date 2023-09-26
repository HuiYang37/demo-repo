package demo_tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.DriverFactory;
import utilities.SeleniumServices;

public class FormTest {

	WebDriver driver;
	SeleniumServices sss;

	@Test
	public void run() {
		sss.openURL("https://demoqa.com/automation-practice-form");
		sss.jsZoom(70);
		By submitButtonLocator = By.id("submit");
		By firstNameInputLocator = By.id("firstName");
		By lastNameInputLocator = By.id("lastName");
		By genderInputLocator = By.id("gender-radio-3");
		By userNumberInputLocator = By.id("userNumber");
		sss.justWait().until(ExpectedConditions.visibilityOfElementLocated(submitButtonLocator));
		sss.pause(2);
		sss.getElement(firstNameInputLocator).sendKeys("John");
		sss.getElement(lastNameInputLocator).sendKeys("Smith");
		sss.jsZoom(100);
		// select gender
		sss.mouse().click(sss.getElement(genderInputLocator)).build().perform();
		
		sss.jsZoom(70);
		sss.getElement(userNumberInputLocator).sendKeys("1234569999");
		
		sss.jsClick(submitButtonLocator);
		sss.pause(3);
	}

	@BeforeMethod
	public void setup() {
		driver = DriverFactory.getDriver("chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		sss = new SeleniumServices(driver);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
