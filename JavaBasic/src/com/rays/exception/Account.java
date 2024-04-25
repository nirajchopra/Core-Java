package com.rays.exception;

public class Account {
	
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		balance += amount;
		System.out.println("Balance after deposit: " + balance);
	}
	
	public void withdrawl(int amount) {
		if((balance - amount) >= 2000) {
			balance -= amount;
			
			System.out.println("Balance afetr Withdrawl: " + balance);
		}else {
			InsufficientBalance e = new InsufficientBalance();
			
		}
	}

}
