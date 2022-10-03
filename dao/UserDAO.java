package ru.pp311.dao;

import ru.pp311.models.User;

import java.util.List;

public interface UserDAO {
    public List<User> index();

    public User show(int id);

    public void save(User user);

    public void delete(int id);

    public void update(int id, User updatedUser);
}
