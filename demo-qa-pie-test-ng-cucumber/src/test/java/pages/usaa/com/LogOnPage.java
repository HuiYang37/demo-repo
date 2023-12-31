package pages.usaa.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumJob;

public class LogOnPage {

	private static final String PAGE_URL = "https://www.usaa.com/my/logon";
	private WebDriverWait wait;
	private SeleniumJob sj;

	@FindBy(id = "Logo-link")
	WebElement logoLink;

	@FindBy(tagName = "h2")
	WebElement pageTitle;

	public LogOnPage(WebDriver driver) {
		sj = new SeleniumJob(driver);
		wait = sj.justWait();
		PageFactory.initElements(driver, this);
	}

	public void waitForPage() {
		wait.until(ExpectedConditions.urlContains(PAGE_URL));
	}

	public void clickOnLogo() {
		logoLink.click();
	}

	public String getPageTitle() {
		return pageTitle.getText();
	}

}
