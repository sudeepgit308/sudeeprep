package com.nt.test;

public class Base extends Derived {

	public static void main(String[] args) {
      try {
    	  throw new Derived();
      }
      catch(Base b) {
    	  System.out.println("Base class Exception");
      }
      catch(Derived d) {
    	  System.out.println("Derived class Exception");
      }
	}

}
