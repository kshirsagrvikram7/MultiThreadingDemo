package com.vksagar.threading.interthreadcommunication;

public class WaitAndNotifyTest {

	public static void main(String[] args) {
		final Account account = new Account();
		
		
		new Thread() {
			public void run() {
				account.withdraw(15000);
			};
		}.start();

		new Thread() {
			public void run() {
				account.deposit(10000);	//TODO : change deposit amount to 1000 and test it
			};
		}.start();
		
	}

}
