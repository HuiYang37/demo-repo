package com.demo;

import java.util.Properties;
import java.util.Map.Entry;

public class Demo {

	public static void printSystemProperties() {
		Properties p = System.getProperties();
		int count = 0;
		for (Entry<Object, Object> entry : p.entrySet()) {
			System.out.println(String.format("%d > %s => %s.", ++count, entry.getKey(), entry.getValue()));
		}
	}

}
