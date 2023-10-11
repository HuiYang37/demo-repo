package utilities.file_readers;

import java.io.FileInputStream;
import java.util.Properties;

public abstract class Reader {

	protected final static String CONFIGS_DIR_PATH = "./src/test/resources/configs/";

	public static Properties loadProperties(String fileName) {
		String fileExtension = ".properties";
		String filePath = CONFIGS_DIR_PATH + fileName + fileExtension;
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
