package com.example.taskmanagementsystem.dto;

import com.example.taskmanagementsystem.models.enums.Role;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Valid
@Getter
@Setter
public class UserDto {
    @NotNull
    private String username;
    @NotNull
    private String password;
    @NotNull
    private Role role;
}
