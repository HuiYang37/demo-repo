package utilities;

public class ConfigReader extends Reader {

	private final static String CONFIG_FILE_PATH = "./src/test/resources/config.properties";

	public static String getBrowserName() {
		String key = "browser";
		load(CONFIG_FILE_PATH);
		return p.getProperty(key);
	}

	public static String getURL() {
		String key = "url";
		load(CONFIG_FILE_PATH);
		return p.getProperty(key);
	}

	public static long getWaitTime() {
		String key = "wait_time";
		load(CONFIG_FILE_PATH);
		long waitTime = Long.valueOf((String) p.get(key));
		return waitTime;
	}

}
