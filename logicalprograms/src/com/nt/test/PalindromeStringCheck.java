package com.nt.test;

import java.util.Scanner;

public class PalindromeStringCheck {
	
	private static boolean isItPalindrome(String inputString){
	String cleanInputString   =	inputString.replaceAll("\\s+", "").toLowerCase();
	    char[] chArray=cleanInputString.toCharArray();
	    int forward=0;
	    int backward=chArray.length-1;
	    while(forward<=backward) {
	    	if(chArray[forward]!=chArray[backward]) {
	    		return false;
	    	}
	    	forward++;
	    	backward--;
	    }//while
	    
		
		return true;
		
	}

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a String ");
    String inputString=  sc.nextLine();
    if(isItPalindrome(inputString)) {
    	System.out.println(inputString +" is a Palindrome");
    }//if
    else {
    	System.out.println(inputString +" is not a Palindrome");
    }
      sc.close();
	}

}
