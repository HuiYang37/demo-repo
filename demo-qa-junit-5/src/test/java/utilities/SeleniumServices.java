package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumServices {

	public static void configDriver(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}

	public static WebDriver findDriver(String browserName) {
		WebDriver driver;
		switch (browserName) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		default:
			throw new IllegalArgumentException(String.format("No such browser: ", browserName));
		}
		return driver;

	}
}
