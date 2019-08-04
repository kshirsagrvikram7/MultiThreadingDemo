package com.vksagar.threading.deadlock;

public class DeadlockTest {

	public static void main(String[] args) {
		final String resource1 = "Printer";
		final String resource2 = "Scanner";

		Runnable runnable1 =()->{
			synchronized (resource1) {
				System.out.println(Thread.currentThread().getName()+" : locked "+resource1);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				synchronized (resource2) {
					System.out.println(Thread.currentThread().getName()+" : locked "+resource2);
				}
			}
		};
		
		Runnable runnable2 =()->{
			synchronized (resource1) {
				System.out.println(Thread.currentThread().getName()+" : locked "+resource1);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				synchronized (resource2) {
					System.out.println(Thread.currentThread().getName()+" : locked "+resource2);
				}
			}
		};
		
		Thread t1 = new Thread(runnable1);
		Thread t2 = new Thread(runnable2);
		
		t1.start();
		t2.start();
	}

}
