package demo_tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FirstTest {

	WebDriver driver;

	@Test
	public void runTest() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			String url = "https://www.gap.com/";
			driver.get(url);
			wait.until(ExpectedConditions.urlToBe(url));
			Thread.sleep(1000);

			By promoLocator = By.id("promo-drawer-button");
			wait.until(ExpectedConditions.visibilityOfElementLocated(promoLocator));

			WebElement promoButton = driver.findElement(promoLocator);
			boolean isExpanded = Boolean.valueOf(promoButton.getAttribute("aria-expanded"));
			if (isExpanded) {
				driver.findElement(By.xpath("//*[contains(@class, 'promoDrawer__handlebar__icon')]")).click();
			}
			Thread.sleep(3000);

			System.out.println("Yay!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}
	}

}
