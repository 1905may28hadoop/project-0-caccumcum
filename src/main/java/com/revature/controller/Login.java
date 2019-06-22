package com.revature.controller;

import com.revature.model.BankUser;
import com.revature.repository.BankUserDAO;
import com.revature.repository.BankUserDAOImpl;

import java.util.List;

public class Login {
    public boolean accountAccess(String userName, String password) {
        System.out.println("Signing in .... ");

/*
        Scanner scanner = new Scanner(System.in);
        String userName, password;
        System.out.println("Please enter your username: ");
        userName = scanner.nextLine();
        System.out.println("Please enter your password: ");
        password = scanner.nextLine();
*/
        BankUserDAO bankUserDAO = new BankUserDAOImpl();
        List<BankUser> userList = bankUserDAO.getUser();



        for(BankUser user: userList){
            if((userName.equals(user.getUserName()) || userName.equals(user.getEmail())) && password.equals(user.getPassWord()) ){
                return true;
            }
        } return false;

    }
}
