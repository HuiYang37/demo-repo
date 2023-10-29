package practices.ui;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import tests.ui.ChromeBaseTest;
import utilities.TestUtils;

public class SvgElementTest extends ChromeBaseTest {

	private String url = "https://www.homedepot.com/";
	private By zipCodeText = By.className("zipCode");
	private By zipCodeExpandSvg = By.xpath("//*[local-name()='svg' and contains(@class, 'deliveryZip')]");
	private By zipCodeInput = By.id("deliveryZipInput");
	private By deliveryZipUpdateButton = By.id("deliveryZipUpdateButton");
	private String zipCode = "20112";

	@Test
	void homePageUpdateZipCodeTest() {
		driver.get(url);
		sj.clickOnElementLocated(zipCodeText);
		sj.stayPut().until(ExpectedConditions.attributeContains(zipCodeExpandSvg, "class", "open"));
		TestUtils.pause(1);
		driver.findElement(zipCodeInput).sendKeys(zipCode);
		TestUtils.pause(1);
		driver.findElement(deliveryZipUpdateButton).click();
		TestUtils.pause(1);
		String actualZipCode = driver.findElement(zipCodeText).getText();
		assertEquals(zipCode, actualZipCode);
	}

}
