package coding_practices;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.Datasets;

public class ReadExcelPractice {

	@DataProvider
	Object[] toData() {
		String filePath = "./src/test/resources/test_data/demo-data.xlsx";
		try {
			FileInputStream input = new FileInputStream(filePath);
			XSSFWorkbook workbook = new XSSFWorkbook(input);
			XSSFSheet testDatasets = workbook.getSheet("tests");
			Datasets datasets = new Datasets(testDatasets);
			workbook.close();

			return datasets.getSets();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Test(dataProvider = "toData")
	void dataTest(HashMap<String, String> datasets) {
		for (Entry<String, String> entry : datasets.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ": " + value);
		}
		System.out.println();
	}

}
