package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@CrossOrigin()
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping("/")
    public String index() {
        return "H W";
    }

    @RequestMapping("/home")
    public String home() {
        return "here is home page";
    }
    @RequestMapping("/doLogin")
    public String doLogin(String title) {
        return title;
    }
}
