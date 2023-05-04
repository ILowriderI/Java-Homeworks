package com.example.javaprohw8.controllers;


import com.example.javaprohw8.models.User;
import com.example.javaprohw8.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.sql.SQLException;
import java.util.ArrayList;

@RestController

public class UserController {

   private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/user/add")
    public ResponseEntity<Boolean> addUser(@RequestBody User user) throws SQLException {
        userService.addUser(user);
        return ResponseEntity.ok().body(true);

    }

    @GetMapping("/users")
    public ArrayList<User> getAllUsers() throws SQLException {
        return (ArrayList<User>) userService.getAllUsers();
    }
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable long id) throws SQLException {
        return userService.getUserById(id);
    }
    @PostMapping("user/update/{id}")
    public  ResponseEntity<Boolean> updateUserById(@RequestBody User user,
                                                   @PathVariable long id) throws SQLException {
        userService.updateUserById(id,user);
        return ResponseEntity.ok().body(true);
    }

    @PostMapping("/user/delete/{id}")
    public  ResponseEntity<Boolean> deleteUserById(@PathVariable long id) throws SQLException {

        userService.deleteUserById(id);

        return ResponseEntity.ok().body(true);
    }

}
