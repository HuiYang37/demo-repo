package com.demo;

import utilities.Assist;

public class StringPractice {

	public static void printReverse(String text) {
		for (int i = text.length() - 1; i >= 0; i--) {
			Assist.print(text.charAt(i));
		}
		System.out.println();
	}

	public static String getReverseText(String text) {
		if (text == null || text.isEmpty())
			return text;
		return text.charAt(text.length() - 1) + getReverseText(text.substring(0, text.length() - 1));
	}

}
