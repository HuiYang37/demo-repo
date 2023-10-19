package tests.junit;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class DataDrivenTest extends BaseTest {

	@ParameterizedTest
	@ValueSource(ints = { 2, 4, 6 })
	void printNums(int num) {
		System.out.println("Print out this number => " + num);
	}

	static Stream<String> fruitTestData() {
		return Stream.of("apple", "orange", "peach");
	}

	@ParameterizedTest
	@MethodSource("fruitTestData")
	void runFruitTest(String fruit) {
		System.out.println(String.format("Please eat %s, it's good for you.", fruit));
	}

	static Stream<HashMap<String, Object>> gradeData() {
		List<HashMap<String, Object>> grades = new ArrayList<HashMap<String, Object>>();
		grades.add(new HashMap<String, Object>( // map content
				Map.ofEntries(new AbstractMap.SimpleEntry<String, Object>("name", "John"),
						new AbstractMap.SimpleEntry<String, Object>("score", 75),
						new AbstractMap.SimpleEntry<String, Object>("isPass", true)) // entries
		) // map
		);

		grades.add(new HashMap<String, Object>( // map content
				Map.ofEntries(new AbstractMap.SimpleEntry<String, Object>("name", "Mary"),
						new AbstractMap.SimpleEntry<String, Object>("score", 50),
						new AbstractMap.SimpleEntry<String, Object>("isPass", false)) // entries
		) // map
		);

		return grades.stream();
	}

	@ParameterizedTest
	@MethodSource("gradeData")
	void runGradeTest(HashMap<String, Object> grade) {
		for (Entry<String, Object> entry : grade.entrySet()) {
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
	}

}
