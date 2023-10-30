package utilities.readers;

import java.util.Properties;

public class SecretReader extends Reader {

	private final static String SECRET_DIR_PATH = "./src/test/resources/secrets/";
	private static Properties p;

	public static void load(String fileName) {
		p = loadProperties(SECRET_DIR_PATH, fileName);
	}

	public static String getSecret(String key) {
		if (p != null) {
			return p.getProperty(key);
		}
		return null;
	}

}
