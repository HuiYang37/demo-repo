package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private final static String CONFIG_FILE_PATH = "./src/test/resources/config.properties";
	private static Properties p;

	private static void load() {
		try {
			FileInputStream input = new FileInputStream(CONFIG_FILE_PATH);
			p = new Properties();
			p.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getBrowserName() throws Exception {
		String key = "browser";
		load();
		if (!p.containsKey(key))
			throw new Exception("Config list does not contain browser name.");
		return p.getProperty(key);
	}

	public static String getURL() throws Exception {
		String key = "url";
		load();
		if (!p.containsKey(key))
			throw new Exception("Config list does not contain browser name.");
		return p.getProperty(key);
	}

}
