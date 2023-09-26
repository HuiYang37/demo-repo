package demo_app;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapPractice {

	public static void main(String[] args) {
		Map<String, Double> productPriceGuide = new HashMap<>();
		productPriceGuide.put("candle", 0.99);
		productPriceGuide.put("pillow", 15.99);
		productPriceGuide.put("umbrella", 7.99);

		printMapMethod_1(productPriceGuide);
		System.out.println();
		printMapMethod_2(productPriceGuide);
	}

	private static void printMapMethod_1(Map<String, Double> items) {
		for (String itemName : items.keySet()) {
			System.out.println(itemName + ": $" + items.get(itemName));
		}
	}

	private static void printMapMethod_2(Map<String, Double> items) {
		for (Entry<String, Double> entry : items.entrySet()) {
			System.out.println(entry.getKey() + ": $" + entry.getValue());
		}
	}

}
