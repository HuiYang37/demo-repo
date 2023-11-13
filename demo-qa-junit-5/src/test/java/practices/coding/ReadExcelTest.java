package practices.coding;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

import utilities.readers.DataReader;

public class ReadExcelTest {

	static Stream<HashMap<String, String>> toData() {
		DataReader.setDataSheetFromFile("demo-data", "tests");
		return DataReader.getDataSheet().getStream();
	}

	@ParameterizedTest
	@MethodSource("toData")
	void dataTest(HashMap<String, String> datasets) {
		for (Entry<String, String> entry : datasets.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ": " + value);
		}
		System.out.println();
	}

	@ParameterizedTest(name = "[{index}] {arguments}")
	@CsvFileSource(resources = "/test-data/Example.csv", useHeadersInDisplayName = true)
	void testWithCsvFileSourceAndHeaders(int studentID, String fullName, int sat_score) {
		System.out.println(String.format("%d, %s, %d", studentID, fullName, sat_score));
	}

}
