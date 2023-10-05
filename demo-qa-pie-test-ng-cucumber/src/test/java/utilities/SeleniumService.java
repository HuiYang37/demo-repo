package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumService {

	public void pause(long seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public WebDriverWait getWait(WebDriver driver) {
		return new WebDriverWait(driver, 15);
	}

	public void alwaysQuit(WebDriver driver) {
		try {

		} finally {
			driver.quit();
		}
	}

}