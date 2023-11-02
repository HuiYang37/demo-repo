package tests.ui;

import java.io.File;
import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import tests.extensions.TestReportListener;
import utilities.SeleniumJob;
import utilities.reports.ReportsManager;
import utilities.reports.TestLogger;

@ExtendWith(TestReportListener.class)
public class ChromeBaseTestWithReports {

	protected WebDriver driver;
	protected SeleniumJob sj;

	@BeforeAll
	static void doFirst() {
		ReportsManager.getInstance();
	}

	@BeforeEach
	void setup() {
		TestLogger.getInstance();
		ChromeOptions options = new ChromeOptions();
		ChromeDriverService service = new ChromeDriverService.Builder()
				.usingDriverExecutable(new File("./src/test/resources/drivers/chromedriver/chromedriver.exe")).build();
		options.setBinary("C:\\Automation\\chrome\\chrome.exe");
		driver = new ChromeDriver(service, options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		sj = new SeleniumJob(driver);
	}

	@AfterEach
	void cleanup() {
		TestLogger.reset();
		driver.quit();
	}

	@AfterAll
	static void doLast() {
		ReportsManager.getReports().flush();
		ReportsManager.reset();
	}

}
