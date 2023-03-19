package com.example.springbootrestfulwebservices.service;

import com.example.springbootrestfulwebservices.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);

    User getUserById(Long userId);

    List<User> getAllUsers();

    User updateUser(User user);
}
