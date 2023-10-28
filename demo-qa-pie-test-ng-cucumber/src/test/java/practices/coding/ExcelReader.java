package practices.coding;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) {
		String filePath = "./src/test/resources/test_data/demo-data.xlsx";
		try {
			FileInputStream input = new FileInputStream(filePath);
			XSSFWorkbook workbook = new XSSFWorkbook(input);
			XSSFSheet testDatasets = workbook.getSheet("tests");
			XSSFCell cell = testDatasets.getRow(1).getCell(6);
			String cellValue = new DataFormatter().formatCellValue(cell);
			System.out.println(Boolean.valueOf(cellValue));
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
