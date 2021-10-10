package com.example.heroku3;

import com.example.heroku3.controller.Hello;
import com.example.heroku3.controller.HelloRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Heroku3Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Heroku3Application.class, args);
    }

    @Autowired
    HelloRepo helloRepo;

    @Override
    public void run(String... args) throws Exception {
        Hello hello = new Hello();
        hello.setName("abc");
        helloRepo.save(hello);
    }
}
