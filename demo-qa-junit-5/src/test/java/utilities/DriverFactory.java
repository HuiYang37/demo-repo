package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

	public static WebDriver getChrome() {
		return SeleniumService.findDriver("chrome");
	}

	public static WebDriver getHeadlessChrome() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		SeleniumService.configDriver(driver);
		return driver;
	}

	public static WebDriver getEdge() {
		return SeleniumService.findDriver("edge");
	}

	public static WebDriver getFirefox() {
		return SeleniumService.findDriver("firefox");
	}

}
