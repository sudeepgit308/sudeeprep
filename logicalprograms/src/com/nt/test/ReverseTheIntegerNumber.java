package com.nt.test;

import java.util.Scanner;

public class ReverseTheIntegerNumber {

	public static void main(String[] args) {
		
		
		
				Integer i=894723;
           reverseTheNumber(i);
	}

	private static void reverseTheNumber(Integer input) {
		int reverse=0;
		int n=input;
		System.out.println(n);
		int remainder;
		while(n!=0) {
			remainder=n%10;
			reverse=reverse*10+remainder;
			n/=10;
		}
		System.out.println("Reverse number is:"+reverse);
	}

}
