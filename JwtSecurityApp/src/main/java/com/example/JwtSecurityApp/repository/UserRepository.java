package com.example.JwtSecurityApp.repository;

import com.example.JwtSecurityApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String name);
}