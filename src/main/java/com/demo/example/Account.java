package com.demo.example;

abstract public class Account{
    
    int accountNumber;
    String name;
    int amount;
    
    public abstract void deposit(int amount);
    public abstract void withdraw(int amount);
    
}
