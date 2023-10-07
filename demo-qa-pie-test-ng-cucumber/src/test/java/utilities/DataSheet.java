package utilities;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class DataSheet {

	private XSSFSheet sheet;

	public DataSheet(XSSFSheet sheet) {
		this.sheet = sheet;
	}

	public Object[] getSets() {
		ArrayList<HashMap<String, String>> sets = new ArrayList<HashMap<String, String>>();
		XSSFRow headerRow = sheet.getRow(0);
		for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
			XSSFRow currentRow = sheet.getRow(rowIndex);
			HashMap<String, String> set = new HashMap<String, String>();
			for (int cellIndex = 0; cellIndex < currentRow.getLastCellNum(); cellIndex++) {
				XSSFCell cell = currentRow.getCell(cellIndex);
				String value = new DataFormatter().formatCellValue(cell);
				set.put(headerRow.getCell(cellIndex).getStringCellValue(), value);
			}
			sets.add(set);
		}
		return sets.toArray();
	}

}
