package com.example.quizInterface.student;

import com.example.quizInterface.gather.Gather;
import com.example.quizInterface.util.InputUtil;

public class StudentGather implements Gather {

    public Object info() {
       String studentName = InputUtil.requireText("Enter name");
        String studentSurname = InputUtil.requireText("Enter surname");
        String studentEmail = InputUtil.requireText("Enter email");
        String studentPassword = InputUtil.requireNumber("Enter password");

        QuizForStudent.quizForum();

        return new Student(studentName, studentSurname, studentEmail, studentPassword);

    }
}
