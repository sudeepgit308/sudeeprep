package com.nt.test;

import java.util.HashSet;
import java.util.Set;

public class PrintRepeatedElementInArrayUsingHashSet {

	public static void main(String[] args) {
		String[] array = new String[] { "bunny", "rasool", "bunny", "neha"};
		
		System.out.println(array.length);
		Set<String> setArray = new HashSet<String>();
		for (String arrayElement : array) {
			if (!setArray.add(arrayElement)) {
				System.out.println("Duplicate Element is:" + arrayElement);
			}
		}
	}
}
