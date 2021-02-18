package com.upgrade.TechnicalBlogPost.controller;


import com.upgrade.TechnicalBlogPost.model.user;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class UserController {
    // URL : user/login
    public String login(Model model){
        model.addAttribute("user",new user());
    }
}
