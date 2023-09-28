package junit_tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import demo.DemoApp;
import junit_test_runners.SmokeTest;

public class MathTest {

	@Test
	@Category(SmokeTest.class)
	public void test_findSum() {
		Assert.assertEquals(6, DemoApp.findSum(new int[] { 1, 2, 3 }));
	}

}
