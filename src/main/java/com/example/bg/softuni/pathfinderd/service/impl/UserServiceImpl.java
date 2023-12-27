package com.example.bg.softuni.pathfinderd.service.impl;

import com.example.bg.softuni.pathfinderd.model.entity.User;
import com.example.bg.softuni.pathfinderd.model.entity.enums.LevelEnum;
import com.example.bg.softuni.pathfinderd.model.entity.service.UserServiceModel;
import com.example.bg.softuni.pathfinderd.repository.UserRepository;
import com.example.bg.softuni.pathfinderd.service.UserService;
import com.example.bg.softuni.pathfinderd.util.CurrentUser;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final CurrentUser currentUser;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper, CurrentUser currentUser) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.currentUser = currentUser;
    }

    @Override
    public void registerUser(UserServiceModel userServiceModel) {
        User user = modelMapper.map(userServiceModel, User.class);
        user.setLevel(LevelEnum.BEGINNER);

        userRepository.save(user);
    }

    @Override
    public UserServiceModel findUserByUsernameAndPassword(String username, String password) {


        return userRepository
                .findByUsernameAndPassword(username, password)
                .map(user -> modelMapper.map(user, UserServiceModel.class))
                .orElse(null);
    }

    @Override
    public void loginUser(Long id, String username) {
        currentUser.setUsername(username);
        currentUser.setId(id);
    }

    @Override
    public void logout() {
        currentUser.setUsername(null);
        currentUser.setId(null);
    }

    @Override
    public UserServiceModel findById(Long id) {
        return userRepository
                .findById(id)
                .map(user -> modelMapper.map(user, UserServiceModel.class))
                .orElse(null);
    }

    @Override
    public boolean isNameExists(String username) {
        return userRepository.findByUsername(username).isPresent();
    }
}
