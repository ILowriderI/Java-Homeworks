package com.example.javaprohw8.services;

import com.example.javaprohw8.dao.UserDAO;
import com.example.javaprohw8.models.User;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;


@Component
public class UserService {
    private final UserDAO userDAO;

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void addUser(User user) throws SQLException {
        userDAO.addUser(user);
    }

    public List<User> getAllUsers() throws SQLException {
      return   userDAO.getAllUsers();
    }

    public User getUserById(long userId) throws SQLException{
      return   userDAO.getUserById(userId);
    }

    public void updateUserById(long id,User user) throws SQLException{
        userDAO.updateUserById(id, user);
    }

    public  void deleteUserById(long id) throws SQLException{
        userDAO.deleteUserById(id);
    }
}
