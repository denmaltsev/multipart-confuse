package ru.example.web.service;

import ru.example.web.dao.User;

import java.util.List;

public interface UserService {

    User getUserByName(String name);

    List<User> getAllUsers();

    void saveUser(String name);

    void deleteUser(String name);
}
