package com.revature.controller;

import com.revature.model.BankUser;
import com.revature.model.UserAccount;
import com.revature.repository.*;

import java.util.ArrayList;
import java.util.List;

public class AccountMenu {
    public double AccountBalance(String userName) {

        long userID = 0;
        long accountNumber = 0;
        double balance=0;
        // get user from username
        BankUserDAO bankUserDAO = new BankUserDAOImpl();
        List<BankUser> userList = bankUserDAO.getUser();

        for (BankUser user : userList) {
            if (userName.equals(user.getUserName())) {
                userID = user.getUserID();
            }
            //pass userid to get Account number
        UserAccountDAO userAccountDAO = new UserAccountDAOImpl();
        accountNumber =userAccountDAO.getAccByUserID(userID);

        //get balance
        AccountDAO accountDAO = new AccountDAOImpl();
        balance = accountDAO.getBalanceByAccNumer(accountNumber);
      //  System.out.println(balance);
        }
        return balance;
    }

    public void deposit() {
        System.out.println("deposit in process");
    }

    public void withdraw() {
        System.out.println("withdraw in process");
    }
}
