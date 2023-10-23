package tests.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import com.demo.ArrayPractice;

//class name must be xxxTest without @Testable
public class DemoTest {

	@Test
	@Tag("demo")
	@Tag("smoke")
	@DisplayName("Demo Smoke Test")
	void run() {
		System.out.println("This a demo smoke test.");
	}

	@Test
	@Tags({ @Tag("demo"), @Tag("math") })
	void findMaxNumTest() throws Exception {
		assertEquals(7, ArrayPractice.findMaxNum(new int[] { 3, 7, 4 }));
	}

	@Test
	void iterativeBinarySearchTest() {
		assertTrue(ArrayPractice.iterativeBinarySearch(new int[] { 0 }, 0));
		assertTrue(ArrayPractice.iterativeBinarySearch(new int[] { 0, 1 }, 0));
		assertTrue(ArrayPractice.iterativeBinarySearch(new int[] { 0, 1 }, 1));

		assertFalse(ArrayPractice.iterativeBinarySearch(new int[] { 0 }, 5));
		assertFalse(ArrayPractice.iterativeBinarySearch(new int[] { 0, 1 }, 5));
	}

}
