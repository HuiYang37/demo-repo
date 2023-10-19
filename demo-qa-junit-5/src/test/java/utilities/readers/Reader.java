package utilities.readers;

import java.io.FileInputStream;
import java.util.Properties;

public abstract class Reader {

	public static Properties loadProperties(String fileDir, String fileName) {
		String fileExtension = ".properties";
		String filePath = fileDir + fileName + fileExtension;
		Properties p = new Properties();
		try {
			FileInputStream input = new FileInputStream(filePath);
			p.load(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}

}
