package ru.example.web.dao;

import ru.example.db.domain.UserEntity;

import java.time.LocalDateTime;

public class User {

    private final String name;
    private final LocalDateTime changed;

    public User(UserEntity entity) {
        this.name = entity.getName();
        this.changed = entity.getTs();
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getChanged() {
        return changed;
    }
}
