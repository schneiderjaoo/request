package com.request.api.controller;

import com.request.api.model.User;
import com.request.api.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @ResponseBody
    @RequestMapping("/get")
    public List<User> listar(){
        List<User> users = userRepository.findAll();
        return users;
    }
    @ResponseBody
    @Transactional
    @RequestMapping(path = "/user", method = RequestMethod.POST)
    public void create(@RequestBody User user) {
        userRepository.save(user);
    }
}
