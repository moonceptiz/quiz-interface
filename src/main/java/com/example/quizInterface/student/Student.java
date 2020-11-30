package com.example.quizInterface.student;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private String studentName;
    private String studentSurname;
    private String studentEmail;
    private String studentPassword;

}



