package demo;

public class DemoApp {

	public static String print(String text) {
		System.out.println(text);
		return text;
	}

	public static int findSum(int[] nums) {
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		return sum;
	}

}
