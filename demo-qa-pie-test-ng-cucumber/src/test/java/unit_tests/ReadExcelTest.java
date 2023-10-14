package unit_tests;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ExcelReader;

public class ReadExcelTest {

	@DataProvider
	Object[] toData() {
		return ExcelReader.getDataSheet("demo-data", "tests").getSets();
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
