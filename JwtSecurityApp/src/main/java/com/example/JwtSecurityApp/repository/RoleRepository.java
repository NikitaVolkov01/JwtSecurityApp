package com.example.JwtSecurityApp.repository;

import com.example.JwtSecurityApp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
