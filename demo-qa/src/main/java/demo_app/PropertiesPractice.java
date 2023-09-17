package demo_app;

import java.util.Properties;

public class PropertiesPractice {

	public static void main(String[] args) {
		Properties sp = System.getProperties();
		for (String propertyName : sp.stringPropertyNames()) {
			System.out.println(propertyName);
		}
		System.out.println("\nJava: " + System.getProperty("java.version"));
		System.out.println(System.getProperty("os.name") + ", " + System.getProperty("os.version"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.dir"));
	}

}
