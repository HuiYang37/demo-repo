package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumJob {

	WebDriverWait wait;
	Actions act;

	public SeleniumJob(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
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
