package com.crudjobs.crudjobs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MyController {

    @GetMapping("/path")
    public String path() {
        return "index";
    }
}
