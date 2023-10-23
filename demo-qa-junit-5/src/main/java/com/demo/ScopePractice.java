package com.demo;

public class ScopePractice {

	public static int getExceptionScope(String text) {
		int i = 0;
		try {
			i = Integer.parseInt(text);
		} catch (Exception e) {
			System.out.println(e);
		}
		return i;
	}

	public static int getLoopScope(int num) {
		int result = 0;
		for (int i = 0; i < num; i++) {
			result *= num;
		}
		return result;
	}

}
