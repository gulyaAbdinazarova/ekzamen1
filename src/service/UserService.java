package service;

import model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    User findById(int id);
    void removeById(int id);
    List<User> getAllUsers();
}
