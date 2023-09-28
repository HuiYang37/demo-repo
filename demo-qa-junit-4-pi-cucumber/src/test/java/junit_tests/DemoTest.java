package junit_tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import demo.DemoApp;
import junit_test_runners.SmokeTest;

public class DemoTest {

	@Test
	@Category(SmokeTest.class)
	public void liarTest() {
		Assert.assertTrue(true);
		System.out.println("This is a smoke test.");
	}
	
	@Test
	public void printTest() {
		Assert.assertEquals("please print this message", DemoApp.print("please print this message"));
	}

}
