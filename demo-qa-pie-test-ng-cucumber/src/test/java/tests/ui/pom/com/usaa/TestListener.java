package tests.ui.pom.com.usaa;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utilities.DriverFactory;
import utilities.SeleniumJob;

public class TestListener implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		WebDriver driver = DriverFactory.getDriver();
		SeleniumJob sj = new SeleniumJob(driver);
		sj.takeScreenshotOnFailedTest();
	}

}
