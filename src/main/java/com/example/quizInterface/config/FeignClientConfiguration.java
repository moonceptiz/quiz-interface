package com.example.quizInterface.config;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = {"com.example.quizInterface.config"})
public class FeignClientConfiguration {

}

