package com.young.blog.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public List<User> getAllUsers() {
        List<User> res = null;

        try {
            res = userMapper.getUsers();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
}
