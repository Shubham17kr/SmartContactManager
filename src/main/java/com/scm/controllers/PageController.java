package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model)
    {
        System.out.println("Home pagehandler");
        model.addAttribute("name", "Shubham kumar");
        model.addAttribute("Sex", "Male");
        model.addAttribute("googleLink", "https://www.Google.com");


        return "home";
    }

    @RequestMapping("/services")
    public String services()
    {
        System.out.println("service pageHandler");
        return "services";
    }

    @RequestMapping("/about")
    public String about(Model model)
    {
        System.out.println("about pageHandler");
        model.addAttribute("isLogin", true);
        return "about";
    }
}

