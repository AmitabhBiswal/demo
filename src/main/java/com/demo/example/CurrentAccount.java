package com.demo.example;

public class CurrentAccount extends Account{
    
    CurrentAccount(){
        this.amount = 0;
    }
    
    CurrentAccount(int amount){
        this.amount = amount;
    }
    
    public void deposit(int amount){
        this.amount += amount;
    }
    
    public void withdraw(int amount){
        this.amount -= amount;
    }
    
    public void displayBalance(){
        System.out.println("Your amount in account is "+amount);
    }
}

