package tests.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

	@BeforeEach
	void startTest() {
		System.out.println("A test starts:");
	}

	@AfterEach
	void endTest() {

	}

	@BeforeAll
	static void doThisFirst() {
		System.out.println("Begin testing...\n");
	}

}
