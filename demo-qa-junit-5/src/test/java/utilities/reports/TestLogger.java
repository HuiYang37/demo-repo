package utilities.reports;

import com.aventstack.extentreports.ExtentTest;

public class TestLogger {

	private static TestLogger logger;
	private static ExtentTest test;
	private static boolean testResult;
	private static Throwable testException;

	private TestLogger() {
	}

	public static TestLogger getInstance() {
		if (logger == null)
			logger = new TestLogger();
		return logger;
	}

	public static void reset() {
		if (logger != null)
			logger = null;
	}

	public static ExtentTest getTest() {
		return test;
	}

	public static void setTest(ExtentTest test) {
		TestLogger.test = test;
	}

	public static boolean getTestResult() {
		return testResult;
	}

	public static void setTestResult(boolean testResult) {
		TestLogger.testResult = testResult;
	}

	public static Throwable getTestException() {
		return testException;
	}

	public static void setTestException(Throwable testException) {
		TestLogger.testException = testException;
	}

}
