package utilities;

import java.util.Properties;

public class ConfigReader extends Reader {

	protected final static String CONFIGS_DIR_PATH = "./src/test/resources/configs/";
	protected static Properties p;

	public static void load() {
		String fileName = "config";
		p = loadProperties(CONFIGS_DIR_PATH, fileName);
	}

	public static void load(String fileName) {
		p = loadProperties(CONFIGS_DIR_PATH, fileName);
	}

	public static String get(String key) {
		return (String) p.get(key);
	}

	public static String getBrowserName() {
		if (p == null)
			load();
		return p.getProperty("browser");
	}

	public static String getURL() {
		if (p == null)
			load();
		return p.getProperty("url");
	}

}
