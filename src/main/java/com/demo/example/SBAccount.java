package com.demo.example;

public class SBAccount extends Account{
    
    float interestRate = 4f;
    int amount;
    
    SBAccount(){
        this.amount = 0;
    }
    
    SBAccount(int amount){
        this.amount = amount;
    }
    
    public void Deposit(int amount){
        this.amount += amount;
    }
    
    public void Withdraw(int amount){
        this.amount -= amount;
    }
    
    public int getBalance(){
        return amount;
    }
}

