package com.revature.model;

public class Account {

    private long AccountNumber;
    private double balance;

    //===========toString()==============================//

    @Override
    public String toString() {
        return "Account{" +
                "AccountNumber=" + AccountNumber +
                ", balance=" + balance +
                '}';
    }

    //===========Default Constructors==============================//

    public Account(long accountNumber, double balance) {
        this.AccountNumber = accountNumber;
        this.balance = balance;
    }

    public Account(long accountNumber) {
        this.AccountNumber = accountNumber;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    //===========getter/setter==============================//
    public long getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}
