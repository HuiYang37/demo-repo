package ui_tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.setBinary("C:\\Automation\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		try {
			driver.get("https://www.dmv.virginia.gov/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//nav//a[@href='/locations']")).click();
			Thread.sleep(3000);
			
			System.out.println("Yay!");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			driver.quit();
		}
	}

}
