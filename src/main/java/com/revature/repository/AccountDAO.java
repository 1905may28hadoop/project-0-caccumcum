package com.revature.repository;

import com.revature.model.Account;

import java.util.List;

public interface AccountDAO {
    List<Account> getAccounts();
    List<Account> getAccountsByID(int userID);
    Account getAccountByNumer(long accountNumber);
    Account createAccount (Account createAccount);
    Account updateAccount (Account updateAccount);
    Account deleteAccount (Account deleteAccount);


}
