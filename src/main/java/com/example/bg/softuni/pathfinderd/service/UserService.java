package com.example.bg.softuni.pathfinderd.service;

import com.example.bg.softuni.pathfinderd.model.entity.service.UserServiceModel;

public interface UserService {
    void registerUser(UserServiceModel userServiceModel);

    UserServiceModel findUserByUsernameAndPassword(String username, String password);
    void loginUser(Long id, String username);

    void logout();

    UserServiceModel findById(Long id);

    boolean isNameExists(String username);
}

