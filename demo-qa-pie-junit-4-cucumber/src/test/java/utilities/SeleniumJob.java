package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumJob {

	WebDriver driver;
	WebDriverWait wait;
	Actions act;

	public SeleniumJob(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 20);
		act = new Actions(driver);
	}

	public WebDriverWait justWait() {
		return wait;
	}

	public Actions mouse() {
		return act;
	}

	public Actions keyboard() {
		return act;
	}

}
