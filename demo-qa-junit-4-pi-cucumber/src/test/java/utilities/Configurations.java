package utilities;

import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Properties;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import junit_test_runners.ChromeTest;
import junit_test_runners.FirefoxTest;

public class Configurations {

	@Test
	@Category(ChromeTest.class)
	public void setChrome() {
		String filePath = "./src/test/resources/tests.properties";
		try {
			FileInputStream input = new FileInputStream(filePath);
			Properties p = new Properties();
			p.load(input);
			p.setProperty("browser", "chrome");

			PrintStream output = new PrintStream(filePath);
			p.list(output);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	@Category(FirefoxTest.class)
	public void setFirefox() {
		String filePath = "./src/test/resources/tests.properties";
		try {
			FileInputStream input = new FileInputStream(filePath);
			Properties p = new Properties();
			p.load(input);
			p.setProperty("browser", "firefox");

			PrintStream output = new PrintStream(filePath);
			p.list(output);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
