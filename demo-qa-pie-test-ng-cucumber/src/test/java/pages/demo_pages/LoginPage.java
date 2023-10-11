package pages.demo_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumJob;

public class LoginPage {

	private static final String PAGE_URL = "https://www.saucedemo.com/";
	private WebDriverWait wait;
	private SeleniumJob sj;

	@FindBy(id = "user-name")
	WebElement usernameInput;

	@FindBy(id = "password")
	WebElement passwordInput;

	@FindBy(id = "login-button")
	WebElement loginButton;

	@FindBy(tagName = "h3")
	WebElement errorText;

	public LoginPage(WebDriver driver) {
		sj = new SeleniumJob(driver);
		wait = sj.justWait();
		PageFactory.initElements(driver, this);
	}

	public void waitForPage() {
		wait.until(ExpectedConditions.urlContains(PAGE_URL));
	}

	public void enterUsername(String username) {
		if (username != null)
			usernameInput.sendKeys(username);
	}

	public void enterPassword(String password) {
		if (password != null)
			passwordInput.sendKeys(password);
	}

	public void clickOnLogin() {
		loginButton.click();
	}

	public String getErrorText() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".error-message-container.error")));
		return errorText.getText();
	}

}
