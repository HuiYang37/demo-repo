package demo_tests.ui;

import org.junit.jupiter.api.Test;

import utilities.TestUtils;

public class GovTest extends BaseTest {

	@Test
	void runTest() {
		driver.get("https://www.usa.gov/");
		TestUtils.pause(2);
	}

}
