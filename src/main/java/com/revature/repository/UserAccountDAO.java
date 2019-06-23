package com.revature.repository;

import com.revature.model.Account;
import com.revature.model.UserAccount;

import java.util.List;

public interface UserAccountDAO {

    long getAccByUserID (long userID);

    List<UserAccount>  getUserAccount();

    int createAccountNumber (UserAccount NewAccountNumber);

    long addUserIDAndAcctNum(UserAccount userID, UserAccount acctNum);

}
