package org.code.General;

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
