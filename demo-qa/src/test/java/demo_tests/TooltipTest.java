package demo_tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import automation.utilities.DriverManager;
import automation.utilities.Testkeys;

public class TooltipTest {

	private WebDriver driver = DriverManager.getInstance();
	private Actions ac = new Actions(driver);

	@Test
	public void runTest() {
		try {
			driver.get("https://jqueryui.com/tooltip/");
			driver.switchTo().frame(0);
			ac.moveToElement(driver.findElement(By.xpath("//input[@id='age']"))).pause(Duration.ofSeconds(1)).build()
					.perform();

			WebElement tooltipContent = driver.findElement(By.xpath("//div[@class='ui-tooltip-content']"));
			System.out.println("Tooltip content: " + tooltipContent.getText());

			Testkeys.pause(driver, 3);
			System.out.println("Yay!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}
	}

}
