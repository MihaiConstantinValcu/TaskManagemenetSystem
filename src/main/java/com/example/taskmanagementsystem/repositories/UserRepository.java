package com.example.taskmanagementsystem.repositories;

import com.example.taskmanagementsystem.models.Group;
import com.example.taskmanagementsystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserById(int id);

    Optional<User> findUserByUsername(String username);
}
