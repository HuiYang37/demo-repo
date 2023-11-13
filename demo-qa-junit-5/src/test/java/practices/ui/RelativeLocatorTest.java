package practices.ui;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import tests.ui.BaseTest;
import utilities.TestUtils;

public class RelativeLocatorTest extends BaseTest {

	// costco
	private String costcoURL = "https://www.costco.com/";
	private By deliveryZipCodeButtonLocator = By.xpath("//button[contains(@aria-label, 'current delivery location')]");
	private By popUpIdLocator = By.cssSelector("div[data-testid='sentinelEnd']");
	private By zipCodeInputLocator = By.id("zipCode");
	private RelativeBy updateZipCodeButtonLocator = RelativeLocator.with(By.cssSelector("button[type='submit']"))
			.below(zipCodeInputLocator);

	private String zipCode = "20112";

	@Test
	void costcoUpdateZipCodeTest() {
		driver.get(costcoURL);
		driver.findElement(deliveryZipCodeButtonLocator).click();
		sj.getWait().until(ExpectedConditions.presenceOfElementLocated(popUpIdLocator));
		driver.findElement(zipCodeInputLocator).sendKeys(zipCode);
		TestUtils.pause(1);
		driver.findElement(updateZipCodeButtonLocator).click();
		TestUtils.pause(1);
		String actualZipCode = driver.findElement(deliveryZipCodeButtonLocator).getText();
		assertEquals(zipCode, actualZipCode);
	}

}
