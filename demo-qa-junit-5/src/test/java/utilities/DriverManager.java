package utilities;

import org.openqa.selenium.WebDriver;

public class DriverManager {

	private static ThreadLocal<DriverManager> threadLocalDriverManager;
	private static WebDriver driver;

	private DriverManager() {
	}

	public static void initManager(String browserName) {
		if (threadLocalDriverManager == null)
			threadLocalDriverManager = new ThreadLocal<DriverManager>();
		if (threadLocalDriverManager.get() == null)
			threadLocalDriverManager.set(new DriverManager());
		if (driver == null)
			driver = SeleniumService.findDriver(browserName);
	}

	public static WebDriver getInstance() {
		return driver;
	}

	public static void tearDownDriver() {
		if (driver != null)
			driver.quit();
		if (threadLocalDriverManager != null)
			threadLocalDriverManager = null;
	}

}
