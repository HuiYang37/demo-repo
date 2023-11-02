package utilities;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class TestUtils {

	public static void pause(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static String getTimestamp() {
		return String.valueOf(System.currentTimeMillis());
	}

	public static void logPass(ExtentTest test) {
		test.log(Status.PASS, "Test passed.");
	}

	public static void logFail(ExtentTest test) {
		test.log(Status.FAIL, "Test failed.");
	}

}
