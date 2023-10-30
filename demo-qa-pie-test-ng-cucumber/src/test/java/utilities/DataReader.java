package utilities;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import pojos.DataSheet;

public class DataReader extends Reader {

	private final static String DATA_DIR_PATH = "./src/test/resources/test_data/";
	private static DataSheet dataSheet;

	public static DataSheet getDataSheet() {
		return dataSheet;
	}

	public static void setDataSheetFromFile(String fileName, String sheetName) {
		XSSFWorkbook workbook = loadExcel(DATA_DIR_PATH, fileName);
		dataSheet = new DataSheet(workbook.getSheet(sheetName));
	}

}
