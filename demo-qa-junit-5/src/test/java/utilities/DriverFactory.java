package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	public static WebDriver getChrome() {
		WebDriver driver = new ChromeDriver();
		SeleniumServices.configDriver(driver);
		return driver;
	}

	public static WebDriver getHeadlessChrome() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-gpu");
		WebDriver driver = new ChromeDriver(options);
		SeleniumServices.configDriver(driver);
		return driver;
	}

	public static WebDriver getFirefox() {
		WebDriver driver = new FirefoxDriver();
		SeleniumServices.configDriver(driver);
		return driver;
	}

}
