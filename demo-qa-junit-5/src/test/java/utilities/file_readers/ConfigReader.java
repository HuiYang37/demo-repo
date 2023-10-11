package utilities.file_readers;

public class ConfigReader extends Reader {

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
