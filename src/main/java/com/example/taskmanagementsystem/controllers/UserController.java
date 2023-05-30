package com.example.taskmanagementsystem.controllers;

import com.example.taskmanagementsystem.dto.UserDto;
import com.example.taskmanagementsystem.models.Group;
import com.example.taskmanagementsystem.models.User;
import com.example.taskmanagementsystem.services.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getAllGroups/{id}")
    public ResponseEntity<List<Group>> getAllGroups(@PathVariable Integer id){
        return ResponseEntity.ok().body(userService.findAllGroups(id));
    }

    @GetMapping
    public ResponseEntity<String> testingSecureEndpoints(){
        return ResponseEntity.ok("Test successful.");
    }

}
