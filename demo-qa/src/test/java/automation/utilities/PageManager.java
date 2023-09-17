package automation.utilities;

import org.openqa.selenium.WebDriver;

public class PageManager {

	private static ThreadLocal<PageManager> threadLocalPageManager;
	private WebDriver driver;

	private PageManager(WebDriver driver) {
		this.driver = driver;
	}

	public static PageManager getInstance() {
		if (threadLocalPageManager == null)
			threadLocalPageManager = new ThreadLocal<>();
		if (threadLocalPageManager.get() == null)
			threadLocalPageManager.set(new PageManager(DriverManager.getInstance()));
		return threadLocalPageManager.get();
	}

	public static void reset() {
		threadLocalPageManager.set(null);
	}

}
