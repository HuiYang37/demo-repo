package com.demo;

public class Reverse {

	public static int printReverseChar(char front, char end) {
		int count = 0;
		while (end >= front) {
			System.out.print(end--);
			count++;
		}
		System.out.println();
		return count;
	}

}
