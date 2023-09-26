package demo_tests.junit_tests;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class DemoNotYouThink {

	@Test
	void run() {
		System.out.println("This is still a test.");
	}
}
