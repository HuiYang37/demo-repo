package demo_tests.junit_tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class CommonTest {

	@BeforeEach
	void setup() {
		System.out.println("A new test starts:");
	}

	@AfterEach
	void tearDown() {
		System.out.println("This test ends.");
	}

	@BeforeAll
	static void doThisFirst() {
		System.out.println("Begin testing...");
	}

}
