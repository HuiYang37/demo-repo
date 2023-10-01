package demo_tests.junit_tests;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class DataDrivenTest extends CommonTest {

	@ParameterizedTest
	@ValueSource(ints = { 2, 4, 6 })
	void printNums(int num) {
		System.out.println("Print out this number => " + num);
	}

	@ParameterizedTest
	@MethodSource("fruitTestData")
	void runFruitTest(String fruit) {
		System.out.println(String.format("Please eat %s, it's good for you.", fruit));
	}

	static Stream<String> fruitTestData() {
		return Stream.of("apple", "orange", "peach");
	}

}
