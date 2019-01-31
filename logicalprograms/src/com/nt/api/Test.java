package com.nt.api;

class Test {
		    public static void main(String args[]) 
		    {
		    	Client clientdata=new Client("raja");
		    	Client clientdata1=new Client("raja");
		    	Server serverdata=new Server("raja");
//		    	System.out.println(clientdata==serverdata);
		    	System.out.println(clientdata.equals(clientdata1));
		    	System.out.println(clientdata1.equals(clientdata));
		    	System.out.println("..............................");
		    	/*String s1=new String("raja");
		    	String s2=new String("raja");
		    	System.out.println(s1==s2);
		    	System.out.println(s1.equals(s2));
		    	System.out.println(s2.equals(s1));*/
		    }
}