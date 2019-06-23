package com.revature.model;

public class BankUser {

    private long userID;
    private String userName;
    private String email;
    private String passWord;

    //===========toString()==============================//

    @Override
    public String toString() {
        return "BankUser{" +
                "userid=" + userID +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }


    //===========Default Constructors==============================//


    public BankUser(long userid, String userName, String email, String passWord) {
        this.userID = userid;
        this.userName = userName;
        this.email = email;
        this.passWord = passWord;
    }

    public BankUser(String userName, String email, String passWord) {

        this.userName = userName;
        this.email = email;
        this.passWord = passWord;
    }

    public BankUser( String userName, String email) {

        this.userName = userName;
        this.email = email;
    }

    //===========getter/setter==============================//


    public long getUserid() {
        return userID;
    }

    public void setUserid(long userid) {
        this.userID = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public BankUser(long userID, String userName) {
           this.userName = userName;
    }




}
