package tests.unit;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.DataReader;

public class ReadExcelTest {

	@DataProvider
	Object[] toData() {
		DataReader.setDataSheetFromFile("demo-data", "tests");
		return DataReader.getDataSheet().getArray();
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
