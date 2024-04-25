package com.rays.exception;

public class TestAccount {
	public static void main(String[] args) {
		Account a = new Account();
		
		a.setBalance(1000);
		a.deposit(5000);
		
		try {
			a.withdrawl(4001);
			
		} catch (Exception e) {
			System.out.println("Exception: " + e);
			
		}
		System.out.println(a.getBalance());
	}

}
