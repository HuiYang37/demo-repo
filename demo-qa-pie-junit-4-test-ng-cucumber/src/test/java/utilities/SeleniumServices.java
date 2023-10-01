package utilities;

import org.openqa.selenium.WebDriver;

public class SeleniumServices {

	public void pause(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void alwaysQuit(WebDriver driver) {
		try {

		} finally {
			driver.quit();
		}
	}

}
