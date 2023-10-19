package utilities.readers;

import java.util.Properties;

public class ConfigReader extends Reader {

	protected final static String CONFIGS_DIR_PATH = "./src/test/resources/configs/";

	public static Properties load(String fileName) {
		return loadProperties(CONFIGS_DIR_PATH, fileName);
	}

	public static String getBrowserName() {
		String key = "browser";
		return (String) load("config").get(key);
	}

	public static String getURL() {
		String key = "url";
		return (String) load("config").get(key);
	}

	public static boolean isDemo() {
		String key = "demo";
		String isDemoStr = load("config").getProperty(key);
		boolean isDemo = Boolean.valueOf(isDemoStr);
		return isDemo;
	}

	public static long getDemoWaitTime() {
		String key = "demo_wait_time";
		String waitTimeStr = load("config").getProperty(key);
		long waitTime = Long.valueOf(waitTimeStr);
		return waitTime;
	}

}
