package com.msw.consumer.controller;

import com.msw.entity.User;
import com.msw.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private TestService testService;

    @GetMapping("/get/user")
    public User getUserById(@RequestParam("id") int id){
        return testService.getUserById(id);
    }

    @GetMapping("/get/userlist")
    public List<User> getUserByName(@RequestParam("id") String name){
        return testService.getUserByName(name);
    }
}
