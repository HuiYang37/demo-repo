package pages.usaa.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumJob;

public class HomePage {

	private static final String PAGE_URL = "https://www.usaa.com/";
	private WebDriverWait wait;
	private SeleniumJob sj;

	@FindBy(xpath = "//div[@class='usaa-globalHeader']//a[@class='pageHeader-iconLink']")
	WebElement logoLink;

	@FindBy(linkText = "Log On")
	WebElement LogOnLink;

	@FindBy(xpath = "//div[@class='globalFooterNav-copyright']")
	WebElement copyrightDiv;

	public HomePage(WebDriver driver) {
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

	public void clickOnLogOn() {
		LogOnLink.click();
	}

	public String getCopyrightSubtitle() {
		return copyrightDiv.getText();
	}

}
