package ru.example.web.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.example.db.domain.UserEntity;
import ru.example.db.repository.UserRepository;
import ru.example.web.dao.User;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User getUserByName(String name) {
        log.info("Get user by name '{}'", name);
        return repository.findByName(name)
                .map(User::new)
                .orElseThrow(()-> new RuntimeException("User not found. Name: " + name));
    }

    @Override
    public List<User> getAllUsers() {
        log.info("Get all exist users");
        return repository.findAll().stream()
                .map(User::new)
                .collect(Collectors.toList());
    }

    @Override
    public void saveUser(String name) {
        log.info("Save user with name '{}'", name);
        repository.save(new UserEntity(name));
    }
}
