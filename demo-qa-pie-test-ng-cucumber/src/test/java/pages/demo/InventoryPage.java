package pages.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumJob;

public class InventoryPage {

	private static final String PAGE_URL = "https://www.saucedemo.com/inventory.html";
	private WebDriverWait wait;
	private SeleniumJob sj;

	public InventoryPage(WebDriver driver) {
		sj = new SeleniumJob(driver);
		wait = sj.justWait();
		PageFactory.initElements(driver, this);
	}

	public void waitForPage() {
		wait.until(ExpectedConditions.urlContains(PAGE_URL));
	}

}
