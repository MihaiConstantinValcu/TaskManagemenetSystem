package com.example.taskmanagementsystem.mappers;

import com.example.taskmanagementsystem.dto.UserDto;
import com.example.taskmanagementsystem.models.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public User userDtoToUser(UserDto userDto){
        return new User(userDto.getUsername(), userDto.getPassword(), userDto.getRole());
    }
}
