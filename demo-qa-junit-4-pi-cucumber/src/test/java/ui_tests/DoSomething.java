package ui_tests;

import java.io.FileInputStream;
import java.util.Properties;

public class DoSomething {

	public static void main(String[] args) {
		String filePath = "./src/test/resources/testing.properties";
		try {
			FileInputStream input = new FileInputStream(filePath);
			Properties p = new Properties();
			p.load(input);

			System.out.println(p.get("browser"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
