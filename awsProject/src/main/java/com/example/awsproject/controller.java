package com.example.awsproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class controller {

    @GetMapping("/health_check")
    public String check() {
        return "Hello";
    }
}
