package demo_tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import automation.utilities.Testkeys;

public class DemoTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		try {
			driver.get("https://demoqa.com/automation-practice-form");
			Testkeys.jsZoom(driver, 0.8);
			Testkeys.pause(driver, 9);
			System.out.println("Yay!");
			assertEquals(false, null);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}
	}

}
