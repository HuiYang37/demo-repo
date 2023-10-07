package demo_tests.junit_tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class CommonTest {

	@BeforeEach
	void setup() {
		System.out.println("A new test begins:");
	}

	@AfterEach
	void tearDown() {
		System.out.println("This test ends.\n");
	}

	@BeforeAll
	static void doThisFirst() {
		System.out.println("Begin testing...\n");
	}

}
