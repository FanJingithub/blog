package com.young.blog.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user")
    //@ResponseBody
    public String hello(Model model) {
        List<User> allUsers = userService.getAllUsers();
        System.out.println(allUsers);
        model.addAttribute("users", allUsers);
        return "hello";
    }
}
