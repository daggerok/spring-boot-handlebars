package com.daggerok.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCtrl {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}