package utilities.file_readers;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	private final static String CONFIGS_DIR_PATH = "./src/test/resources/configs/";

	public static Properties loadProperties(String fileName) {
		String fileExtension = ".properties";
		String filePath = CONFIGS_DIR_PATH + fileName + fileExtension;
		Properties p = new Properties();
		try {
			FileInputStream input = new FileInputStream(filePath);
			p.load(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}

	public static String getBrowserName() {
		String key = "browser";
		return (String) loadProperties("config").get(key);
	}

	public static String getURL() {
		String key = "url";
		return (String) loadProperties("config").get(key);
	}

	public static boolean isDemo() {
		String key = "demo";
		String isDemoStr = loadProperties("config").getProperty(key);
		boolean isDemo = Boolean.valueOf(isDemoStr);
		return isDemo;
	}

	public static long getDemoWaitTime() {
		String key = "demo_wait_time";
		String waitTimeStr = loadProperties("config").getProperty(key);
		long waitTime = Long.valueOf(waitTimeStr);
		return waitTime;
	}

}
