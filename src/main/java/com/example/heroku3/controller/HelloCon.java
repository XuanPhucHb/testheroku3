package com.example.heroku3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloCon {

    @Autowired
    HelloRepo helloRepo;

    @GetMapping("/")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello")
    public List<Hello> helloAll(){
        return helloRepo.findAll();
    }
}
