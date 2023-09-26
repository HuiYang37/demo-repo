package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumServices {

	WebDriver driver;
	WebDriverWait wait;
	Actions actions;

	public SeleniumServices(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		actions = new Actions(driver);
	}

	public WebElement getElement(By locator) {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return driver.findElement(locator);
	}

	public WebElement getVisibleElement(By locator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		highlightElement(locator);
		return driver.findElement(locator);
	}

	public void click(By locator) {
		getElement(locator).click();
	}

	public void printElementText(By locator) {
		System.out.println(getElement(locator).getText());
	}

	public void openURL(String url) {
		driver.get(url);
	}

	public Actions mouse() {
		return actions;
	}

	public Actions keyboard() {
		return actions;
	}

	public WebDriverWait justWait() {
		return this.wait;
	}

	public void highlightElement(By locator) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 0; i < 3; i++) {
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", driver.findElement(locator),
					"color: red; border: 2px solid red;");
			pause(1);
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", driver.findElement(locator), "");
			pause(1);
		}
	}

	public void pause(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void toFrame(WebElement element) {
		driver.switchTo().frame(element);
	}

	public void exitFrame() {
		driver.switchTo().defaultContent();
	}

	public void jsZoom(int percent) {
		String script = String.format("document.body.style.zoom='%d%%'", percent);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(script);
	}

	public void jsClick(By locator) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", getVisibleElement(locator));
	}

}
