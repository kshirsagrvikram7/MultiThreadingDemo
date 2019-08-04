package com.vksagar.threading.basic;

public class ThreadTest extends Thread {
	
	@Override
	public void run() {
		for(int i=0; i<10; i++)
			System.out.println("Run :: "+i);
	}

	public static void main(String[] args) {
		ThreadTest test = new ThreadTest();
		test.run();
	}

}
