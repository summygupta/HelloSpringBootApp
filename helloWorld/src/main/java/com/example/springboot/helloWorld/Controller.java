package com.example.springboot.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String helloWorld()
    {
       return "hello spring boot";
    }

}
