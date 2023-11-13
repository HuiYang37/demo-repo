package utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumJob {

	WebDriver driver;
	WebDriverWait wait;
	Actions act;

	public SeleniumJob(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		act = new Actions(driver);
	}

	public WebDriverWait getWait() {
		return wait;
	}

	public void waitForDisplayElementLocated(By locator) {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public Actions mouse() {
		return act;
	}

	public Actions keyboard() {
		return act;
	}

	public boolean containsElement(By locator) {
		wait = new WebDriverWait(this.driver, Duration.ofSeconds(3));
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}

	public void clickOnElementLocated(By locator) {
		wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
		if (containsElement(locator) && getWait()
				.until(ExpectedConditions.not(ExpectedConditions.stalenessOf(driver.findElement(locator))))) {
			mouse().moveToElement(driver.findElement(locator)).click().build().perform();
		}
	}

	public void takeScreenshotOnFailedTest() {
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String name = "Failed-Test";
		String filePath = String.format("./src/test/resources/failed-test-images/%s-%s.png", name,
				TestUtils.getTimestamp());
		try {
			FileUtils.copyFile(screenshotFile, new File(filePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
