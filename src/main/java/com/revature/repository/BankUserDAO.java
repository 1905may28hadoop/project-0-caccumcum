package com.revature.repository;

import com.revature.model.BankUser;

import java.util.List;

public interface BankUserDAO {

    List<BankUser>  getUser();
    BankUser getUserByID(long userID);
    int createUser (BankUser user);
    int updateUser (BankUser user);
    int deleteUser (BankUser user);
}
