package com.nt.test;

import java.util.Scanner;

public class PalindromeNumberCherck {
	
	private static boolean isPAlindromeNumber(int input) {
		int number=input;
		int remainder=0;
		int reverse=0;
		while(number!=0) {
			remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}//while
		if(reverse==input) {
			return true;
		}
		else {
		return false;
		}
	}

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a number ");
	    int input=  sc.nextInt();
	    if(isPAlindromeNumber(input)) {
	    	System.out.println(input +" is a Palindrome");
	    }//if
	    else {
	    	System.out.println(input +" is not a Palindrome");
	    }
	      sc.close();
		}

	}


