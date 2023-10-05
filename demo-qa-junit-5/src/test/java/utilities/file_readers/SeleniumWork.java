package utilities.file_readers;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWork {

	WebDriverWait wait;
	Actions act;

	public SeleniumWork(WebDriver driver) {
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
