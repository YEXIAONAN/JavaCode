package org.code.general;

import javax.naming.InsufficientResourcesException;

public class CheckingAccount {
    private double balance;
    private int number;
    public CheckingAccount(int number){
        this.number = number;
    }

    public void deposit(double amount){
        balance += amount;
    }

}
