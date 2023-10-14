package com.demo;

import java.util.Map.Entry;
import java.util.Properties;

public class DemoApp {

	public static int getMaxNumFromArray(int[] nums) throws Exception {
		if (nums.length == 0)
			throw new Exception("Please do not pass an empty array.");
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max)
				max = nums[i];
		}
		return max;
	}

	public static void printSystemProperties() {
		Properties p = System.getProperties();
		int count = 0;
		for (Entry<Object, Object> entry : p.entrySet()) {
			System.out.println(String.format("%d > %s => %s.", ++count, entry.getKey(), entry.getValue()));
		}
	}

}
