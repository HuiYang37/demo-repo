package tests.extensions;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import utilities.reports.ReportsManager;
import utilities.reports.TestLogger;

public class TestReportListener implements AfterTestExecutionCallback, BeforeTestExecutionCallback {

	@Override
	public void beforeTestExecution(ExtensionContext context) throws Exception {
		String testName = context.getTestMethod().get().getName();
		System.out.println(String.format("Test <%s>:", testName));
		TestLogger.getInstance();
		ExtentTest test = ReportsManager.getReports().createTest(testName);
		TestLogger.setTest(test);
	}

	@Override
	public void afterTestExecution(ExtensionContext context) throws Exception {
		ExtentTest test = TestLogger.getTest();
		boolean result = context.getExecutionException().isPresent();
		if (result) {
			TestLogger.setTestResult(false);
			test.log(Status.FAIL, context.getExecutionException().get());
			System.out.println("Test failed.\n");
		} else {
			TestLogger.setTestResult(true);
			test.log(Status.PASS, "Test passed.");
			System.out.println("Test passed.\n");
		}
	}

}
