package utilities;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public abstract class Reader {

	protected static Properties loadProperties(String fileDir, String fileName) {
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

	protected static XSSFWorkbook loadExcel(String fileDir, String fileName) {
		String fileExtension = ".xlsx";
		String filePath = fileDir + fileName + fileExtension;
		XSSFWorkbook workbook = null;
		try {
			FileInputStream input = new FileInputStream(filePath);
			workbook = new XSSFWorkbook(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return workbook;
	}

}
