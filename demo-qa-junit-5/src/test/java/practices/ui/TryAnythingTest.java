package practices.ui;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import tests.ui.BaseTest;
import utilities.TestUtils;

public class TryAnythingTest extends BaseTest {

	@Test
	void run() {
		driver.get("https://www.totalwine.com/");
		TestUtils.pause(2);
		try {
			driver.findElement(By.id("agegate-closeX")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		TestUtils.pause(2);
	}

}
