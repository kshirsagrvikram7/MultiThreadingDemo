package com.vksagar.threading.interthreadcommunication;

public class Account {

	int balance = 10000;

	synchronized void withdraw(int amount) {
		System.out.println(">>>>>>> Start of withdrawing");
		if (amount > balance) {
			System.out.println("Withdrawl amount is greater than balance.");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (amount < balance) {
			this.balance -= amount;
			System.out.println("Take your cash Rs. " + amount);
			System.out.println("Balance is Rs. " + this.balance);
		} else {
			System.out.println("Insufficient balance.");
		}
		System.out.println("<<<<<<<<< End of withdrawing");
	}

	synchronized void deposit(int depositAmount) {
		System.out.println(">>>>>>> Start of depositing");
		this.balance += depositAmount;
		System.out.println("Rs. " + depositAmount + " amount deposited in your account");
		System.out.println("Total balance is Rs. " + this.balance);
		notify();
		System.out.println("<<<<<<<<< End of depositing");
	}

}
