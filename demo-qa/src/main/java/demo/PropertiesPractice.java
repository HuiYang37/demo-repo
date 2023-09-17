package demo;

import java.util.Properties;

public class PropertiesPractice {

	public static void main(String[] args) {

		Properties sp = System.getProperties();

		System.out.println(sp.stringPropertyNames().size());
		for (String propertyName : sp.stringPropertyNames()) {
			System.out.println(propertyName);
		}
		System.out.println();
		System.out.println(System.getProperty("user.dir"));
	}

}
