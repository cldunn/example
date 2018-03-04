package com.cldbiz.demo.controller.ui;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloUIController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
