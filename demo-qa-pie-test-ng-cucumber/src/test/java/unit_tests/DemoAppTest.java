package unit_tests;

import static org.testng.Assert.*;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.demo.DemoApp;

public class DemoAppTest {

	@Test(priority = -1, groups = { "math" })
	public void test_getMaxNumFromArray() throws Exception {
		int[] nums = { 3, -4, 38, 0 };
		int expectedMaxNum = 38;
		assertEquals(DemoApp.getMaxNumFromArray(nums), expectedMaxNum);
	}

	@Test
	public void testNG_FirstTest() {
		System.out.println("This is a testNG test.");
	}

	@AfterMethod
	void endTest(ITestResult result) {
		if (result.isSuccess())
			System.out.println("Test passed.\n");
		else
			System.out.println("Test failed.\n");
	}

}
