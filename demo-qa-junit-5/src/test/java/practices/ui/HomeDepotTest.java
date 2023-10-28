package practices.ui;

import org.junit.jupiter.api.Test;

import tests.ui.BaseTest;
import utilities.TestUtils;

public class HomeDepotTest extends BaseTest {

	private String url = "https://www.homedepot.com/";

	@Test
	void run() {
		driver.get(url);
		TestUtils.pause(3);
	}

}
