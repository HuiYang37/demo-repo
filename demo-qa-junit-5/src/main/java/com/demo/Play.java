package com.demo;

import java.util.Arrays;

public class Play {

	public static void main(String[] args) {
		int[] nums = { 14, 22, 96, 48, 94, 81, 75, 95, 43, 81 };
		System.out.println("Original: " + Arrays.toString(nums));
		System.out.println("Asc: " + Arrays.toString(DemoApp.bubbleSort(nums, true)));
		System.out.println("Desc: " + Arrays.toString(DemoApp.bubbleSort(nums, false)));
	}

}
