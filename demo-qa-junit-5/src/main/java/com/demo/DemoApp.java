package com.demo;

import java.util.ArrayList;
import java.util.Random;

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

	public static int[] bubbleSort(int[] nums, boolean asc) {
		for (int j = 0; j < nums.length; j++) {
			for (int i = 0; i < nums.length - 1; i++) {
				int x = nums[i], y = nums[i + 1];
				if (asc) {
					if (x > y) {
						nums[i] = y;
						nums[i + 1] = x;
					}
				} else {
					if (x < y) {
						nums[i] = y;
						nums[i + 1] = x;
					}
				}
			}
		}
		return nums;
	}
	
	public static void printNums() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			nums.add(random.nextInt(99) + 1);
		}
		System.out.println(nums);
	}

}
