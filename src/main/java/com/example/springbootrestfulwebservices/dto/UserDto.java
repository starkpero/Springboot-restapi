package com.example.springbootrestfulwebservices.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long Id;
    @NotEmpty(message = "User firstName should not be empty")
    private String firstName;
    @NotEmpty(message = "User lastName should not be empty")
    private String lastName;
    @NotEmpty
    @Email
    private String email;
}
