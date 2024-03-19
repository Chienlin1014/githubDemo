package org.example.githubdemo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {
    private final HelloService helloService;

    public HelloWord(HelloService helloService) {
        this.helloService = helloService;
    }

    @RequestMapping("/")
    public String hello() {

        return helloService.hello();

    }
}
