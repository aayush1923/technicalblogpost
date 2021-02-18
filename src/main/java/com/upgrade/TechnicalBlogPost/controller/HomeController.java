package com.upgrade.TechnicalBlogPost.controller;

import com.upgrade.TechnicalBlogPost.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
@Controller
public class HomeController {
    @RequestMapping("/getallpost")
    private  String getAllPosts(Model model){
        ArrayList<Post> posts=new ArrayList<>();
        Post post1=new Post();
        post1.setTitle("post 1");
        post1.setBody("body of post 1");
        post1.setDate(new Date());

        Post post2=new Post();
        post2.setTitle("post 2");
        post2.setBody("body of post 2");
        post2.setDate(new Date());

        Post post3=new Post();
        post3.setTitle("post 3");
        post3.setBody("body of post 3");
        post3.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        model.addAttribute("posts",posts);
        return "index";
    }
}
