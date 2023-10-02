package utilities;

public class ConfigReader extends Reader {

	private final static String CONFIG_FILE_PATH = "./src/test/resources/config.properties";

	public static String getBrowserName() {
		String key = "browser";
		load(CONFIG_FILE_PATH);
		return get(key);
	}

	public static String getURL() {
		String key = "url";
		load(CONFIG_FILE_PATH);
		return get(key);
	}

	public static boolean isDemo() {
		String key = "demo";
		load(CONFIG_FILE_PATH);
		boolean isDemo = Boolean.valueOf(get(key));
		return isDemo;
	}

	public static long getDemoWaitTime() {
		String key = "demo_wait_time";
		load(CONFIG_FILE_PATH);
		long waitTime = Long.valueOf(get(key));
		return waitTime;
	}

}
