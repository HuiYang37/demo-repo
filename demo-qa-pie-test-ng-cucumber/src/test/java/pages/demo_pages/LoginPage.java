package pages.demo_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumServices;

public class LoginPage {

	private static final String PAGE_URL = "https://www.saucedemo.com/";
	private WebDriverWait wait;
	private SeleniumServices ss;

	@FindBy(id = "user-name")
	WebElement usernameInput;

	@FindBy(id = "password")
	WebElement passwordInput;

	@FindBy(id = "login-button")
	WebElement loginButton;

	public LoginPage(WebDriver driver) {
		ss = new SeleniumServices();
		wait = ss.getWait(driver);
		PageFactory.initElements(driver, this);
	}

	public void waitForPage() {
		wait.until(ExpectedConditions.urlContains(PAGE_URL));
	}

	public void enterUsername(String username) {
		usernameInput.sendKeys(username);
	}

	public void enterPassword(String password) {
		passwordInput.sendKeys(password);
	}

	public void clickOnLogin() {
		loginButton.click();
	}

}
