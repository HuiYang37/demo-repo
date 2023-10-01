package com.demo;

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

}
