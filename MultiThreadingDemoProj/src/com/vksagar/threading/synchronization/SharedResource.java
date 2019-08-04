package com.vksagar.threading.synchronization;

public class SharedResource {

	public synchronized void print(int a) {	// synchronization is achieved using synchronized keyword
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName() +" :: "+(i*a));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
