package com.revature.repository;

import com.revature.model.Account;

import java.util.List;

public interface AccountDAO {
    List<Account> getAccounts();
    double getBalanceByAccNumBer(long accountNumber);

    double newBalance (Account newBalance);


}
