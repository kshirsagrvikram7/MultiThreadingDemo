package com.vksagar.threading.synchronization;

public class Thread2 extends Thread {
	private SharedResource resource;

	public Thread2(SharedResource resource) {
		this.resource = resource;
	}
	
	@Override
	public void run() {
		resource.print(100);
	}
	
}
