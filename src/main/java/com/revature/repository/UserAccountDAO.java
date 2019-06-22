package com.revature.repository;

import com.revature.model.Account;
import com.revature.model.UserAccount;

import java.util.List;

public interface UserAccountDAO {

    long getAccByUserID (long userID);

    List<UserAccount>  getUserAccount();

    UserAccount createAccount (Account createAccount);

    UserAccount updateAccount (Account updateAccount);

    UserAccount deleteAccount (Account deleteAccount);

}
