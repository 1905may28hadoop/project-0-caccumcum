package com.revature.model;

public class UserAccount {

    private long userID;
    private long accountNumber;

    //===========toString()==============================//
    @Override
    public String toString() {
        return "UserAccount{" +
                "userID=" + userID +
                ", accountNumber=" + accountNumber +
                '}';
    }

    //===========Default Constructors==============================//
    public UserAccount(long userID, long accountNumber) {
        this.userID = userID;
        this.accountNumber = accountNumber;
    }

    public UserAccount(long userID) {
        this.userID = userID;
    }

//===========getter/setter==============================//

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
}
