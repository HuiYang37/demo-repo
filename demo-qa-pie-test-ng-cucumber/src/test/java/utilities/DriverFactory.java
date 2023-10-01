package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	private static ThreadLocal<WebDriver> threadLocalDriver;

	private static void initDriver(String browserName) throws Exception {
		WebDriver driver;
		switch (browserName.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver/chromedriver.exe");
			ChromeOptions co = new ChromeOptions();
			co.setBinary("C:\\Automation\\chrome-win64\\chrome.exe");
			driver = new ChromeDriver(co);
			break;
		case "firefox":
			System.setProperty("webdriver.firefox.driver",
					"./src/test/resources/drivers/firefoxdriver/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		default:
			throw new Exception("Invalid browser name.");
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		threadLocalDriver = new ThreadLocal<WebDriver>();
		threadLocalDriver.set(driver);
	}

	public static void initDriver() {
		try {
			if (threadLocalDriver == null || threadLocalDriver.get() == null)
				initDriver(ConfigReader.getBrowserName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static WebDriver getDriver() {
		try {
			if (threadLocalDriver == null || threadLocalDriver.get() == null)
				initDriver(ConfigReader.getBrowserName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return threadLocalDriver.get();
	}

	public static void resetDriver() {
		if (threadLocalDriver.get() != null)
			threadLocalDriver.get().quit();
		threadLocalDriver.set(null);
	}

}
