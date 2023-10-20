package com.demo;

import utilities.Assist;

public class StringPractice {

	public static void printReverse(String text) {
		for (int i = text.length() - 1; i >= 0; i--) {
			Assist.print(text.charAt(i));
		}
		System.out.println();
	}

}
