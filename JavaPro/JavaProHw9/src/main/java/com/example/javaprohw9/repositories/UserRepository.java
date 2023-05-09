package com.example.javaprohw9.repositories;

import com.example.javaprohw9.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository  extends JpaRepository<User,Long> {

    List<User> findByNameContaining(String name);
}
