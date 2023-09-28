package demo_files;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesReader {

	public static String getBrowserName() {
		String browserName = null;
		String filePath = "./src/test/resources/testing.properties";
		try {
			FileInputStream input = new FileInputStream(filePath);
			Properties p = new Properties();
			p.load(input);

			browserName = p.getProperty("browser");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return browserName;
	}

}
