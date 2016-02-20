package com.daggerok.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexPage {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}