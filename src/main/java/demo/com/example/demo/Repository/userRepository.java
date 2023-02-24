package demo.com.example.demo.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import demo.com.example.demo.Entity.userEntity;

@Repository
public class userRepository {

    private List<userEntity> userList = new ArrayList<>();

    public userEntity addUser(userEntity user) {
        userList.add(user);
        return user;
    }

    public userEntity findUserByUsername(String username) {
        for (userEntity user : userList) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
