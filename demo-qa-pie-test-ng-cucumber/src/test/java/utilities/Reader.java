package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Reader {

	protected static Properties p;

	protected static void load(String filePath) {
		try {
			FileInputStream input = new FileInputStream(filePath);
			p = new Properties();
			p.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
