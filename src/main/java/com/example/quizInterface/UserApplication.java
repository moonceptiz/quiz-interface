package com.example.quizInterface;

import com.example.quizInterface.enter.HomePage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomePage.class, args);
    }

}
