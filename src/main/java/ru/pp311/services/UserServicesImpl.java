package ru.pp311.services;

import org.springframework.stereotype.Component;
import ru.pp311.dao.UserDAO;
import ru.pp311.models.User;
import javax.transaction.Transactional;
import java.util.List;

@Component
public class UserServicesImpl implements UserService {

    private final UserDAO userDAO;
    public UserServicesImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Transactional
    @Override
    public List<User> index() {
        return userDAO.index();
    }

    @Transactional
    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Transactional
    @Override
    public void delete(int id) {
        userDAO.delete(id);
    }

    @Transactional
    @Override
    public User show(int id) {
        return userDAO.show(id);
    }

    @Transactional
    @Override
    public void update(int id, User user) {
        userDAO.update(id, user);
    }

}
