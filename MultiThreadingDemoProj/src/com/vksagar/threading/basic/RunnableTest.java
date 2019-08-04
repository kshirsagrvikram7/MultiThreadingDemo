package com.vksagar.threading.basic;

public class RunnableTest implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Runnable :: "+i);
		}
	}

	public static void main(String[] args) {
		RunnableTest test = new RunnableTest();
		Thread thread = new Thread(test);
		thread.start();
	}

}
