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
    private long accountNumber;


    @Override
    public List<Account> getAccounts() {
        List<Account> accountList = new ArrayList<>();
        try(Connection conn = ConnectionUtil.getConnection()){
            statement = conn.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM ACCOUNT");
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
    public double getBalanceByAccNumBer(long accountNumber) {
        this.accountNumber = accountNumber;
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
    public double newBalance(Account newBalance) {
        double newbalance1 =0;
        try (Connection conn = ConnectionUtil.getConnection()){
            String sql = "INSERT INTO ACCOUNT (BALANCE) VALUES(?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDouble(1, newBalance.getBalance());
            newbalance1 = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            CloseStream.close(statement);
        }
        return newbalance1;
    }


}
