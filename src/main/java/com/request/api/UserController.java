package com.request.api;

import com.request.api.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    @ResponseBody
    @RequestMapping("/get")
    public List<User> listar(){
        User u0 = new User("Joao", "abc");
        User u1 = new User("Guilherme", "123");
        User u2 = new User("Schneider", "321");

        return Arrays.asList(u0, u1, u2);
    }
}
