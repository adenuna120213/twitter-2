package com.example.twitter2.Service;

import com.example.twitter2.Model.User;

import java.util.List;

public interface UserService {
    User findById(String id);
    void deleteById(String id);
    List<User> getAllUsers();
    User findByLogin(String login);





}
