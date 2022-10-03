package ru.pp311.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import ru.pp311.dao.UserDAO;
import ru.pp311.models.User;
import ru.pp311.repository.UserRepository;

import java.util.List;

@Component
public class UserServicesImpl implements UserService {

    @Autowired
    private UserRepository ur;

//    private final UserDAO userDAO;
//    public UserServicesImpl(UserDAO userDAO) {
//        this.userDAO = userDAO;
//    }

//    @Transactional
    @Override
    public List<User> index() {
        return (List<User>) ur.findAll();
    }

//    @Transactional
    @Override
    public void save(User user) {
        ur.save(user);
    }

//    @Transactional
    @Override
    public void delete(int id) {
        ur.deleteById(id);
    }

//    @Transactional
    @Override
    public User show(int id) {
        return ur.findById(id).get();
    }

//    @Transactional
    @Override
    public void update(int id, User user) {
        User urDB = ur.findById(id).get();
        ur.save(urDB);
    }

}
