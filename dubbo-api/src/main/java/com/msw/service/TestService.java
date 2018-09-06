package com.msw.service;

import com.msw.entity.User;

import java.util.List;

public interface TestService {
    public User getUserById(int id);

    public List<User> getUserByName(String name);
}
