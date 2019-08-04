package com.vksagar.threading.synchronization;

public class Thread1 extends Thread {
	private SharedResource resource;

	public Thread1(SharedResource resource) {
		this.resource = resource;
	}
	
	@Override
	public void run() {
		resource.print(5);
	}
	
}
