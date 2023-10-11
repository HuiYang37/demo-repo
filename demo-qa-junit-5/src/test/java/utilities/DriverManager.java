package utilities;

import org.openqa.selenium.WebDriver;

public class DriverManager {

	private static ThreadLocal<DriverManager> tlDriverManager;
	private static WebDriver driver;

	private DriverManager() {
	}

	public static void initManager(String browserName) {
		if (tlDriverManager == null)
			tlDriverManager = new ThreadLocal<DriverManager>();
		if (tlDriverManager.get() == null)
			tlDriverManager.set(new DriverManager());
		if (driver == null)
			driver = SeleniumService.findDriver(browserName);
	}

	public static WebDriver getInstance() {
		return driver;
	}

}
