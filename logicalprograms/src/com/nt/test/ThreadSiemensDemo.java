package com.nt.test;

public class ThreadSiemensDemo implements Runnable {
	
	
	public ThreadSiemensDemo() throws InterruptedException {
     Thread.sleep(5000);
	}

	@Override
	public void run() {
  System.out.println("Iam from run method");		
	}

}
