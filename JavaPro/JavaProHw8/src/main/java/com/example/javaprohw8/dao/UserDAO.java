package com.example.javaprohw8.dao;

import com.example.javaprohw8.MyConnection;
import com.example.javaprohw8.models.User;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


@Repository
public class UserDAO {


    public void addUser(User user) throws SQLException {
        Connection connection = MyConnection.createConnection();

        PreparedStatement preparedStatement = connection
                .prepareStatement("INSERT INTO users VALUES(DEFAULT,?,?,?,?)");
        preparedStatement.setString(1, user.getName());
        preparedStatement.setString(2, user.getSurname());
        preparedStatement.setString(3, user.getPhoneNumber());
        preparedStatement.setString(4, user.getGander());
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
    }

    public List<User> getAllUsers() throws SQLException {
        Connection connection = MyConnection.createConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM users ");
        List resultList = new ArrayList<User>();

        while (resultSet.next()) {

            long id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String surname = resultSet.getString(3);
            String phoneNumber = resultSet.getString(4);
            String gander = resultSet.getString(5);
            resultList.add(new User(id, name, surname, phoneNumber, gander));

        }
        statement.close();
        connection.close();

        return resultList;

    }

    public User getUserById(long userId) throws SQLException {
        Connection connection = MyConnection.createConnection();
        PreparedStatement preparedStatement = connection
                .prepareStatement("SELECT * FROM users WHERE id = ?");
        preparedStatement.setLong(1,  userId);
        ResultSet resultSet = preparedStatement.executeQuery();
        User result = null;
        while (resultSet.next()) {

            long id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String surname = resultSet.getString(3);
            String phoneNumber = resultSet.getString(4);
            String gander = resultSet.getString(5);
            result = new User(id, name, surname, phoneNumber, gander);

        }

        connection.close();
        preparedStatement.close();
        return  result;
    }

    public void updateUserById(long id,User user) throws SQLException {
        Connection connection = MyConnection.createConnection();
        PreparedStatement preparedStatement = connection
                .prepareStatement("UPDATE users SET name = ?,surname=?," +
                        "phone_number=?,gander=? WHERE  id=?");
        preparedStatement.setString(1,user.getName());
        preparedStatement.setString(2, user.getSurname());
        preparedStatement.setString(3, user.getPhoneNumber());
        preparedStatement.setString(4, user.getGander());
        preparedStatement.setLong(5,id);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();

    }


    public  void deleteUserById(long id) throws SQLException {
        Connection connection = MyConnection.createConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(" DELETE " +
                "FROM users WHERE id=?");
        preparedStatement.setLong(1,id);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
    }

}
