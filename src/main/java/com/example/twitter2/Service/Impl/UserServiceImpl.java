package com.example.twitter2.Service.Impl;

import com.example.twitter2.Model.User;
import com.example.twitter2.Reposetories.UserRepositories;
import com.example.twitter2.Service.UserService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Data
public class UserServiceImpl implements UserService {
    private final UserRepositories userRepositories;

    public UserServiceImpl(UserRepositories userRepositories) {
        this.userRepositories = userRepositories;
    }

    @Override
    public User findById(String id) {
        return userRepositories.findById(id).orElse(null);
    }
    @Override
    public void deleteById(String id) {
        userRepositories.deleteById(id);

    }
    @Override
    public List<User> getAllUsers() {
        return userRepositories.findAll();
    }
    @Override
    public User findByLogin(String login) {
        return userRepositories.findByLogin(login).orElse(null);
    }
}
