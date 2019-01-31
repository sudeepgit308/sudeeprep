package com.nt.test;

import java.util.ArrayList;

import java.util.List;

public class ArrayListSiemens {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		fruits.add("banana");
		fruits.add("apple");
		addMoreFruits(fruits);
		System.out.println(fruits);

	}

	private static void addMoreFruits(List<String> fruits1) {
		System.out.println(fruits1);
		fruits1.add("grapes");
		fruits1.add("mango");
		System.out.println(fruits1);
		fruits1 = null;
		System.out.println(fruits1);
	}
}
