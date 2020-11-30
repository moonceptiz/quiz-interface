package com.example.quizInterface.teacher;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private String teacherName;
    private String teacherSurname;
    private String teacherProf;
    private String subject;



    public static void main(String[] args) {
        QuizForTeacher.quizForum();
    }
}
