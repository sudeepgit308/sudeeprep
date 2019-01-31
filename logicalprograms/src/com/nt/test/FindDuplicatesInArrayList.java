package com.nt.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicatesInArrayList {

	public static void main(String[] args) {
       ArrayList<String> al=new ArrayList<String>();
       al.add("sudeep");
       al.add("bunny");
       al.add("sudeep");
     
       
       Map<String,Integer> duplicateCountMap=new HashMap<String,Integer>();
       for(String word:al) {
    	   duplicateCountMap.put(word, duplicateCountMap.containsKey(word)?duplicateCountMap.get(word)+1:1);
       }
       
       for(Entry<String,Integer> entry:duplicateCountMap.entrySet()) {
    	   if(entry.getValue()>1) {
    		   System.out.println("Duplicate word is:"+entry.getKey()+ " for"+entry.getValue()+"times");
    	   }
       }
	}
}
