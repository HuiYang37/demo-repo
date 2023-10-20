package utilities;

import org.openqa.selenium.WebDriver;

public class DriverManager {

	private static ThreadLocal<DriverManager> threadLocalDriverManager;
	private static WebDriver driver;

	private DriverManager(String browserName) {
		driver = SeleniumService.findDriver(browserName);
	}

	public static void initManager(String browserName) {
		if (threadLocalDriverManager == null)
			threadLocalDriverManager = new ThreadLocal<DriverManager>();
		if (threadLocalDriverManager.get() == null)
			threadLocalDriverManager.set(new DriverManager(browserName));
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void resetManager() {
		if (driver != null)
			driver.quit();
		threadLocalDriverManager.set(null);
	}

}
