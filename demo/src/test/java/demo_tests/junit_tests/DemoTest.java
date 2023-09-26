package demo_tests.junit_tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.demo.DemoApp;

//class name must be xxxTest without @Testable
public class DemoTest {

	@Test
	void run() {
		System.out.println("Demo testing...");
	}

	@Test
	@Tag("max")
	void testDemoApp_findMax() {
		assertEquals(7, DemoApp.findMax(new int[] { 3, 7, 4 }));
	}

}
