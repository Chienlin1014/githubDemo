package org.example.githubdemo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {
    @RequestMapping("/")
    public String hello() {

        return "Hello  World!";

    }
}
