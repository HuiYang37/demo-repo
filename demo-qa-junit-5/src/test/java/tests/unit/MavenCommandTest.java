package tests.unit;

import java.util.Properties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MavenCommandTest {

	static Properties p;

	@BeforeEach
	void setUp() {
		p = System.getProperties();
	}

	@Test
	void run() {
		String browserName = (String) p.get("browser");
		if (browserName != null)
			System.out.println(browserName + " is running.");
		else
			Assertions.fail("No browser data.");
	}

}
