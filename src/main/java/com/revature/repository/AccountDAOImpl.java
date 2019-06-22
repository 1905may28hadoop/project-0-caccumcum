package com.revature.repository;

import com.revature.model.Account;
import com.revature.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class AccountDAOImpl implements AccountDAO {
    PreparedStatement statement = null;
    ResultSet resultSet = null;

    @Override
    public List<Account> getAccounts() {

        return null;
    }


    @Override
    public List<Account> getAccountsByID(int userID) {
        return null;
    }

    @Override
    public Account getAccountByNumer(long accountNumber) {
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Account account =null;
        try(Connection conn = ConnectionUtil.getConnection()){
            statement = conn.prepareStatement("SELECT  * from ACCOUNT WHERE ACCOUNT_NUMBER = ?");
            statement.setLong(1,accountNumber);
            statement.execute();
            resultSet = statement.getResultSet();
            resultSet.next();
            account = new Account(resultSet.getLong("Account_Number"),resultSet.getLong("balance"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return account;
    }
//    PreparedStatement statement = null;
//    ResultSet resultSet = null;
//    PetType petType = null;
//		try (Connection conn = ConnectionUtil.getConnection()) {
//        statement = conn.prepareStatement("SELECT * FROM pet_types WHERE typename = ?");
//        statement.setString(1, typename);
//        statement.execute();
//        resultSet = statement.getResultSet();
//        resultSet.next();
//        petType = new PetType(resultSet.getLong("id"), resultSet.getString("typename"),
//                resultSet.getInt("max_energy"), resultSet.getInt("max_hunger"), null,
//                resultSet.getString("is_outsite").equals("T"));
//
//    } catch (SQLException e) {
//        e.printStackTrace();
//    } finally {
//        CloseStreams.close(statement);
//        CloseStreams.close(resultSet);
//    }
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
