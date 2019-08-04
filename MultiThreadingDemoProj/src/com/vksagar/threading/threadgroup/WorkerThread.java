package com.vksagar.threading.threadgroup;

public class WorkerThread implements Runnable {

	private String message;
	
	public WorkerThread(String message) {
		this.message = message;
	}


	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() +" - Start message : "+message);
		processMessage();
		System.out.println(Thread.currentThread().getName() + " - End message : "+message);
	}
	
	private void processMessage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
