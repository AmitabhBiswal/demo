package com.demo.example;


public class App 
{
	public static void main(String[] args) {
			
		SBAccount savings = new SBAccount(1000);
		savings.Withdraw(250);
		savings.Deposit(400);
		System.out.println("Current balance in account "+savings.getBalance());
		    
	}
}
