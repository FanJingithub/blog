package com.young.blog.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model) {
        //model.addAllAttributes();
        return "hello";
    }

//    @GetMapping("/hello")
//    public ModelAndView doGet() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addAllObjects();
//        modelAndView.setView("hello");
//        return modelAndView;
//    }
}
