package unit_tests;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

import com.demo.DemoApp;

public class DemoAppTest {

	@Test(priority = -1, groups = { "math" })
	public void test_getMaxNumFromArray() throws Exception {
		System.out.println("Testing <DemoApp#getMaxNumFromArray>...");
		int[] nums = { 3, -4, 38, 0 };
		int expectedMaxNum = 38;
		assertEquals(DemoApp.getMaxNumFromArray(nums), expectedMaxNum);
		System.out.println("Test <DemoApp#getMaxNumFromArray> passed.");
	}

	@Test
	public void testNG_FirstTest() {
		System.out.println("This is a testNG test.");
	}

}
