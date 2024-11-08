package com.example.twitter2.Controller;

import com.example.twitter2.Model.Tweet;
import com.example.twitter2.Model.User;
import com.example.twitter2.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable String id) {
        return service.findById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id) {
        service.deleteById(id);
    }
    @GetMapping("/list")
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }
    @GetMapping("/login/{login}")
    public User getByLogin(@PathVariable String login) {
        return service.findByLogin(login);
    }

}
