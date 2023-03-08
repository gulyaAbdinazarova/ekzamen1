package impl;

import dao.UserDao;
import exception.MyException;
import model.User;
import service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDao();

    @Override
    public void addUser(User user) {
        userDao.getUsers().add(user);
    }

    @Override
    public User findById(int id) {
        try {
            for (User user : userDao.getUsers()) {
                if (user.getId() == id) {
                    return user;
                }
            }
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
    }
        return null;
    }


    @Override
    public void removeById  (int id) {
        for (User user:userDao.getUsers()){
            if(user.getId()==id){
                userDao.getUsers().remove(user);
            }
        }
    }

    @Override
    public List<User> getAllUsers() {
        try {
            return userDao.getUsers();
        }catch (Exception e){
            throw new MyException("getAll exception");
        }

    }
    }

