package com.vksagar.threading.synchronization;

public class SynchronizeThreadTest {

	public static void main(String[] args) {
		SharedResource resource = new SharedResource();
		
		Thread1 t1 = new Thread1(resource);
		Thread2 t2 = new Thread2(resource);
		
		t1.start();
		t2.start();
	}

}
