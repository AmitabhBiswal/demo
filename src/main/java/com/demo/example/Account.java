package com.demo.example;

abstract public class Account{
    
    int accountNumber;
    String name;
    int amount;
    
    public abstract void Deposit(int amount);
    public abstract void Withdraw(int amount);
    
}
