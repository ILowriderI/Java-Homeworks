package com.example.javaprohw9.controllers;

import com.example.javaprohw9.models.User;
import com.example.javaprohw9.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserService userService;



    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("user/add")
    public Long addUser(@RequestBody User user){
        userService.addUser(user);
        return user.getId();
    }

    @PostMapping("/user/delete/{id}")
    public ResponseEntity<Boolean> deleteUserById(@PathVariable Long id){
        userService.deleteUserById(id);
        return  ResponseEntity.ok(true);
    }

    @GetMapping("/search/user/{name}")
    public List<User> searchUserByName(@PathVariable String name){
        return  userService.searchUserByName(name);
    }
}
