package com.revature.repository;

import com.revature.model.Account;
import com.revature.model.UserAccount;
import com.revature.util.CloseStream;
import com.revature.util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserAccountDAOImpl implements UserAccountDAO{
    private PreparedStatement prepareStatement = null;
    private ResultSet resultSet = null;
    private Statement statement = null;
    private UserAccount userAccount = null;


    @Override
    public long getAccByUserID(long userID) {
        long user1 = 0;
        try(Connection conn = ConnectionUtil.getConnection()){
            prepareStatement = conn.prepareStatement("SELECT  * from USER_ACCOUNT where Account_number =?");
            prepareStatement.setLong(1,userID);
            prepareStatement.execute();
            resultSet = prepareStatement.getResultSet();
            resultSet.next();
            userAccount = new UserAccount(
                    resultSet.getLong("USERID"),resultSet.getLong("ACCOUNT_NUMBER")
            );
            user1 = userAccount.getAccountNumber();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user1;
    }

    @Override
    public List<UserAccount> getUserAccount() {
        List<UserAccount> userAccountList = new ArrayList<>();
        try(Connection conn = ConnectionUtil.getConnection()){
            statement = conn.createStatement();
            resultSet = statement.executeQuery("SELECT  * from USER_ACCOUNT");
            while (resultSet.next()){
                userAccount = new UserAccount(
                        resultSet.getLong("USERID"),resultSet.getLong("ACCOUNT_NUMBER")
                );
                userAccountList.add(userAccount);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            CloseStream.close(statement);
            CloseStream.close(resultSet);
        }
        return userAccountList;
    }

    @Override
    public UserAccount createAccount(Account createAccount) {
        return null;
    }

    @Override
    public UserAccount updateAccount(Account updateAccount) {
        return null;
    }

    @Override
    public UserAccount deleteAccount(Account deleteAccount) {
        return null;
    }
}
