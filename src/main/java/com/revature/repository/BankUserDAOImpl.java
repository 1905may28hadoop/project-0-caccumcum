package com.revature.repository;

        import com.revature.model.BankUser;
        import com.revature.util.CloseStream;
        import com.revature.util.ConnectionUtil;

        import java.sql.*;
        import java.util.ArrayList;
        import java.util.List;

public class BankUserDAOImpl implements BankUserDAO {
    private Statement statement=null;
    private ResultSet resultSet=null;
    private BankUser bankUser=null;
    private PreparedStatement preparedStatement =null;
    private long userID =0;

    @Override
    public List<BankUser> getUser() {
        List<BankUser> userList = new ArrayList<>();
        try(Connection conn = ConnectionUtil.getConnection()){
//
            statement = conn.createStatement();
            resultSet = statement.executeQuery("SELECT  * from BANK_USER");
//
            while (resultSet.next()){
                bankUser = new BankUser(
                        resultSet.getLong("userid"),resultSet.getString("username"),
                        resultSet.getString("email"),resultSet.getString("password")
                );
                userList.add(bankUser);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            CloseStream.close(statement);
            CloseStream.close(resultSet);
        }

        return userList;
    }

    @Override
    public long getUserIDByUserName(String userName) {



        return 0;
    }

    @Override
    public BankUser getUserByID(long userId) {
        try(Connection conn = ConnectionUtil.getConnection()){
            preparedStatement = conn.prepareStatement("SELECT  * from BANK_USER WHERE USERID = ?");
            preparedStatement.setLong(1,userId);
            preparedStatement.execute();
            resultSet = preparedStatement.getResultSet();
            resultSet.next();
            bankUser = new BankUser(resultSet.getLong("userid"),resultSet.getString("username"),
                    resultSet.getString("email"),resultSet.getString("password"));

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            CloseStream.close(preparedStatement);
            CloseStream.close(resultSet);
        }
        return bankUser;
    }

    @Override
    public int createUser(BankUser user) {
        return 0;
    }

    @Override
    public int updateUser(BankUser user) {
        return 0;
    }

    @Override
    public int deleteUser(BankUser user) {
        return 0;
    }
}
