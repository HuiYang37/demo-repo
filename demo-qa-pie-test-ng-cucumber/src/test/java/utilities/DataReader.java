package utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataReader {

	private final static String DATA_DIR_PATH = "./src/test/resources/test_data/";

	public DataSheet getDataSheet(String dataFileName, String sheetName) {
		String extension = ".xlsx";
		String filePath = DATA_DIR_PATH + dataFileName + extension;
		DataSheet dataSheet = null;
		try {
			FileInputStream input = new FileInputStream(filePath);
			XSSFWorkbook workbook = new XSSFWorkbook(input);
			XSSFSheet sheet = workbook.getSheet(sheetName);
			dataSheet = new DataSheet(sheet);
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataSheet;
	}

}
