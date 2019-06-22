package com.revature.model;

public class Transaction {

    private long transactionID;
    private long accountNumber;
    private String date;
    private String description;

    //===========toString()==============================//
    @Override
    public String toString() {
        return "Transaction{" +
                "transactionID=" + transactionID +
                ", accountNumber=" + accountNumber +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    //===========Default Constructors==============================//
    public Transaction(long transactionID, long accountNumber, String date, String description) {
        this.transactionID = transactionID;
        this.accountNumber = accountNumber;
        this.date = date;
        this.description = description;
    }

    public Transaction(long transactionID, long accountNumber, String date) {
        this.transactionID = transactionID;
        this.accountNumber = accountNumber;
        this.date = date;
    }

    public Transaction(long transactionID, long accountNumber) {
        this.transactionID = transactionID;
        this.accountNumber = accountNumber;
    }

    public Transaction(long transactionID) {
        this.transactionID = transactionID;
    }

    //===========getter/setter==============================//
    public long getTranactionID() {
        return transactionID;
    }

    public void setTranactionID(long tranactionID) {
        this.transactionID = tranactionID;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDiscription() {
        return description;
    }

    public void setDiscription(String discription) {
        this.description = discription;
    }
}
