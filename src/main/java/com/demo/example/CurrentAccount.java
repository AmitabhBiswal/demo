package com.demo.example;

public class CurrentAccount extends Account{
    
    CurrentAccount(){
        this.amount = 0;
    }
    
    CurrentAccount(int amount){
        this.amount = amount;
    }
    
    public void Deposit(int amount){
        this.amount += amount;
    }
    
    public void Withdraw(int amount){
        this.amount -= amount;
    }
    
    public void DisplayBalance(){
        System.out.println("Your amount in account is "+amount);
    }
}

