package com.revature.repository;

import com.revature.model.Account;
import com.revature.util.CloseStream;
import com.revature.util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountDAOImpl implements AccountDAO {
    private PreparedStatement prepareStatement = null;
    private ResultSet resultSet = null;
    private Statement statement = null;
    private Account account = null;


    @Override
    public List<Account> getAccounts() {
        List<Account> accountList = new ArrayList<>();
        try(Connection conn = ConnectionUtil.getConnection()){
            statement = conn.createStatement();
            resultSet = statement.executeQuery("SELECT  * from ACCOUNT");
            while (resultSet.next()){
                account = new Account(
                        resultSet.getLong("Account_Number"),resultSet.getLong("balance")
                );
                accountList.add(account);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            CloseStream.close(statement);
            CloseStream.close(resultSet);
        }
        return accountList;
    }


    @Override
    public double getBalanceByAccNumer(long accountNumber) {
        double balance = 0;
        try(Connection conn = ConnectionUtil.getConnection()){
            prepareStatement = conn.prepareStatement("SELECT  * from ACCOUNT WHERE ACCOUNT_NUMBER = ?");
            prepareStatement.setLong(1,accountNumber);
            prepareStatement.execute();
            resultSet = prepareStatement.getResultSet();
            resultSet.next();
            account = new Account(resultSet.getLong("Account_Number"),resultSet.getLong("balance"));
            balance = account.getBalance();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return balance;
    }

    @Override
    public Account createAccount(Account createAccount) {
        return null;
    }

    @Override
    public Account updateAccount(Account updateAccount) {
        return null;
    }

    @Override
    public Account deleteAccount(Account deleteAccount) {
        return null;
    }
}
