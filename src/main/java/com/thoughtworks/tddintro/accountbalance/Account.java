package com.thoughtworks.tddintro.accountbalance;

/**
 * Created by sallie on 7/19/15.
 */

public class Account {

    private double balance;

    public Account (double balance){
        this.balance=balance;
    }

    public double transaction(double amount){
        balance= balance+amount;
        return balance;
    }

}
