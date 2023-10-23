package com.demo;

import java.util.Random;

public class ArrayPractice {

	public static int findMaxNum(int[] nums) throws Exception {
		if (nums == null || nums.length == 0)
			throw new Exception("Cannot find the maximum value in an empty array.");
		int index = getMaxIndex(nums);
		return nums[index];
	}

	public static int getMaxIndex(int[] nums) throws Exception {
		if (nums == null || nums.length == 0)
			throw new Exception("Cannot find the index of maximum value in an empty array.");
		int max = nums[0];
		int maxIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	public static void bubbleSort(int[] nums, boolean asc) {
		int max = nums.length - 1;
		for (int j = 0; j < nums.length - 1; j++) {
			for (int i = 0; i < max; i++) {
				int left = nums[i], right = nums[i + 1];
				// ascending order
				if (asc) {
					if (left > right) {
						nums[i] = right;
						nums[i + 1] = left;
					}
				}
				// descending order
				else {
					if (left < right) {
						nums[i] = right;
						nums[i + 1] = left;
					}
				}
			}
			max--;
		}
	}

	public static boolean iterativeBinarySearch(int[] nums, int target) {
		int min = 0;
		int max = nums.length - 1;
//		int count = 0;
		while (min <= max) {
			int mid = (max + min) / 2;
//			System.out.println(++count + " > min:" + min + ", mid:" + mid + ", max:" + max);
			// target is found
			if (nums[mid] == target)
				return true;
			// target is in upper half
			else if (target > nums[mid])
				min = mid + 1;
			// target is in lower half
			else
				max = mid - 1;
		}
		return false;
	}

	public static int[] getRandomNums(int num, int min, int max) {
		int[] nums = new int[num];
		Random randomizer = new Random();
		for (int i = 0; i < num; i++) {
			nums[i] = randomizer.nextInt(max - min) + min;
		}
		return nums;
	}

	public static int getRecursiveFibonacciNum(int num) {
		if (num == 1)
			return 0;
		if (num == 2)
			return 1;
		return getRecursiveFibonacciNum(num - 1) + getRecursiveFibonacciNum(num - 2);
	}

	public static int[] getRecursiveFibonacciNums(int num) {
		int[] nums = new int[num];
		return getRecursiveFibonacciNums(num, nums);
	}

	private static int[] getRecursiveFibonacciNums(int num, int[] nums) {
		nums[0] = 0;
		if (num > 1)
			nums[1] = 1;
		if (num > 2)
			nums[num - 1] = getRecursiveFibonacciNums(num - 1, nums)[num - 2]
					+ getRecursiveFibonacciNums(num - 2, nums)[num - 3];
		return nums;
	}

}
