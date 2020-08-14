package com.demo.example;


public class App 
{
	public static void main(String[] args) {
			
		SBAccount savings = new SBAccount(1000);
		savings.withdraw(250);
		savings.deposit(400);
		System.out.println("Current balance in account "+savings.getBalance());
		    
	}
}
