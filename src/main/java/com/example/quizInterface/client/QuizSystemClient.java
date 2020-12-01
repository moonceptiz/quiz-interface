package com.example.quizInterface.client;

import com.example.quizInterface.client.model.StudentClient;
import feign.Logger;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "quiz-sys", url = "${http://localhost:8080}",
        configuration = QuizSystemClient.class, primary = true)
public interface QuizSystemClient {

    @PostMapping("/userinfo")
    StudentClient createStudent(@RequestBody StudentClient createStudent);

    @PostMapping("/userinfo/{id}")
    StudentClient createStudentById(@PathVariable("id") long id,
                                    @RequestBody StudentClient createStudent);

    class FeignConfiguration {
        @Bean
        Logger.Level feignLoggerLevel() {
            return Logger.Level.FULL;
        }
    }
}
