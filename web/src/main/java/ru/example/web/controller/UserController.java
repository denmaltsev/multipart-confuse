package ru.example.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.example.web.dao.User;
import ru.example.web.service.UserService;

import java.util.List;

@RestController
public class UserController extends ControllerAbs {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping(path = "users/{name}")
    public void saveUser(@PathVariable("name") String name) {
        userService.saveUser(name);
    }

    @GetMapping(path = "users/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUserByName(@PathVariable("name") String name) {
        return userService.getUserByName(name);
    }

    @GetMapping(path = "users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
