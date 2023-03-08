import impl.UserServiceImpl;
import model.Gender;
import model.User;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User user  = new User(1,"Timur", 25, Gender.MALE);
        User user2  = new User(2,"Meder", 23,Gender.MALE);
        User user3 = new User(3,"Elnura", 22,Gender.FEMALE);

        UserServiceImpl userServiceImpl = new UserServiceImpl();
        userServiceImpl.addUser(user);
        userServiceImpl.addUser(user2);
        userServiceImpl.addUser(user3);
        System.out.println(userServiceImpl.findById(1));

        userServiceImpl.removeById(2);
        System.out.println(userServiceImpl.getAllUsers());




    }
}