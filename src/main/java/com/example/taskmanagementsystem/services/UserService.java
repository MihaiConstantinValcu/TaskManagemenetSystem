package com.example.taskmanagementsystem.services;

import com.example.taskmanagementsystem.dto.UserDto;
import com.example.taskmanagementsystem.mappers.UserMapper;
import com.example.taskmanagementsystem.models.Group;
import com.example.taskmanagementsystem.models.User;
import com.example.taskmanagementsystem.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public List<Group> findAllGroups(int id){
        return userRepository.findUserById(id).getGroups();
    }

    public User createUser(UserDto userDto) {
        return userRepository.save(userMapper.userDtoToUser(userDto));
    }
}
