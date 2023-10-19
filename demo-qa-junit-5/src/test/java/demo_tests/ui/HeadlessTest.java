package demo_tests.ui;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.TestUtils;

public class HeadlessTest extends HeadlessBaseTest {

	@Test
	void runTest() {
		driver.get("https://www.usaa.com/");
		driver.findElement(By.xpath("//a[text()='Membership']")).click();
		TestUtils.pause(1);
		List<WebElement> joinElements = driver.findElements(By.xpath("//a[text()='Join USAA']"));
		System.out.println("Total <Join> buttons: " + joinElements.size());
		System.out.println(driver.getTitle());
		System.out.println("Test passed.");
	}

}
