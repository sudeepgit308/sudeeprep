package com.nt.test;

public class ThreadRunDemo {

	public static void main(String[] args) throws InterruptedException {
    ThreadSiemensDemo tsd=new ThreadSiemensDemo();
      Thread th=new Thread(tsd);
      th.start();
	}

}
