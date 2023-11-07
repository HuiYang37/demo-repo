package tests.unit;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.SoftAssertions;
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
		assertTrue(ArrayPractice.iterativeBinarySearch(new int[] { 0, 1 }, 1));
		assertTrue(ArrayPractice.iterativeBinarySearch(new int[] { 0, 1 }, 1));

		assertFalse(ArrayPractice.iterativeBinarySearch(new int[] { 0 }, 5));
		assertFalse(ArrayPractice.iterativeBinarySearch(new int[] { 0, 1 }, 5));
	}

	@Test
	void softAssertTest() {
		System.out.println("Step - 1: Something.");
		boolean isStepOneFailed = true;
		System.out.println("Step - 2: Something.");
		boolean isStepTwoFailed = false;
		System.out.println("Step - 3: Something.");
		boolean isStepThreeFailed = true;
		assertAll(() -> assertFalse(isStepOneFailed, "Step 1 has failed"),
				() -> assertFalse(isStepTwoFailed, "Step 2 has failed"),
				() -> assertFalse(isStepThreeFailed, "Step 3 has failed."));
	}

	@Test
	void softAssertAgainTest() {
		SoftAssertions assertions = new SoftAssertions();

		int actualNum = 5;
		System.out.println("Number: " + actualNum);
		assertions.assertThat(actualNum).isEqualTo(5);

		boolean isEven = false;
		System.out.println("Is number even: " + isEven);
		assertions.assertThat(isEven).isEqualTo(true);

		String name = "Cat";
		System.out.println("I love " + name);
		assertions.assertThat(name).isEqualTo("Cat");

		assertions.assertAll();
	}

}
