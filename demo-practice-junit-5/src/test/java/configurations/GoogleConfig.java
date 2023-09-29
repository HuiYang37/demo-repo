package configurations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class GoogleConfig {

	private final static String FILE_PATH = "./src/test/resources/properties/google.properties";
	private static Properties p;

	private static void load() throws Exception {
		FileInputStream input = new FileInputStream(FILE_PATH);
		Properties p = new Properties();
		p.load(input);
		GoogleConfig.p = p;
	}

	public static void update(String key, String value) {
		try {
			load();
			p.setProperty(key, value);
			p.store(new FileOutputStream(FILE_PATH), String.format("[%s: %s] has been added/updated", key, value));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void printProperties() {
		try {
			load();
			for (String propertyName : p.stringPropertyNames()) {
				System.out.println(propertyName);
			}
			if (p.isEmpty())
				System.out.println("This file contains no property.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String get(String key) {
		try {
			load();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (String) p.get(key);
	}

}
