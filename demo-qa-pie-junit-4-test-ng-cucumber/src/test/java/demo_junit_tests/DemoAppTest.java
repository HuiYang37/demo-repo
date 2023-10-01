package demo_junit_tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.demo.DemoApp;

import junit_categories.Math;

public class DemoAppTest {

	@Test
	@Category(Math.class)
	public void test_getMaxNumFromArray() throws Exception {
		System.out.println("Testing <DemoApp#getMaxNumFromArray>...");
		int[] nums = { 3, -4, 38, 0 };
		int expectedMaxNum = 38;
		Assert.assertEquals(expectedMaxNum, DemoApp.getMaxNumFromArray(nums));
		System.out.println("Test <DemoApp#getMaxNumFromArray> passed.");
	}

	@Test
	public void junitFirstTest() {
		System.out.println("This is a junit test.");
	}

}
