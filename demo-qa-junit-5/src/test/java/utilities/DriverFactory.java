package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	public static WebDriver getChrome() {
		WebDriver driver = new ChromeDriver();
		SeleniumService.configDriver(driver);
		return driver;
	}

	public static WebDriver getHeadlessChrome() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		SeleniumService.configDriver(driver);
		return driver;
	}

	public static WebDriver getFirefox() {
		WebDriver driver = new FirefoxDriver();
		SeleniumService.configDriver(driver);
		return driver;
	}

}
