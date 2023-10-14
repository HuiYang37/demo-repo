package com.demo;

public class DemoApp {

	public static void main(String[] args) {
		System.out.println("This is a demo.");
	}

	public static int findMaxNumFromArray(int[] nums) {
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max)
				max = nums[i];
		}
		return max;
	}

}
