package com.example.rpggeneratormb.dao;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {
    /*@GetMapping("/")
    @ResponseBody
    public String index(){
        return "index";
    }*/
@GetMapping("/fail")
    public String fail(){
        return "fail";
}
    @GetMapping("/sign-up")
    public String signup(Model model){
    model.addAttribute("user", new User());
        return "sign-up";
    }
    @PostMapping("/register")
    public String register(User user){
        System.out.println(user);
        return "sign-up";
    }


/*    @GetMapping("/zobacz")
    public String forUser(){
        return "zobacz";
    }*/
}
