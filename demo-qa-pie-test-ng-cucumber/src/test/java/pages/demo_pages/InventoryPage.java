package pages.demo_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumServices;

public class InventoryPage {

	private static final String PAGE_URL = "https://www.saucedemo.com/";
	private WebDriverWait wait;
	private SeleniumServices ss;

	public InventoryPage(WebDriver driver) {
		ss = new SeleniumServices();
		wait = ss.getWait(driver);
		PageFactory.initElements(driver, this);
	}

	public void waitForPage() {
		wait.until(ExpectedConditions.urlContains(PAGE_URL));
	}

}
