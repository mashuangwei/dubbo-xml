package com.msw.provider.service;

import com.msw.entity.User;
import com.msw.service.TestService;

import java.util.ArrayList;
import java.util.List;

public class TestServiceImpl implements TestService {
    @Override
    public User getUserById(int id) {
        User user = new User("周星驰", "香港", 39, 1);
        User user2 = new User("高圆圆", "北京", 33, 2);

        if (id == 1) {
            return user;
        }
        return user2;
    }

    @Override
    public List<User> getUserByName(String name) {
        User user = new User("周星驰", "香港", 39, 1);
        User user2 = new User("高圆圆", "北京", 33, 2);
        User user3 = new User("林志玲", "台湾", 40, 3);
        User user4 = new User("奶茶妹", "上海", 24, 4);
        List<User> userList= new ArrayList<>();
        userList.add(user);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        return userList;
    }
}
