package com.example.quizInterface.teacher;


import com.example.quizInterface.gather.Gather;
import com.example.quizInterface.util.InputUtil;

public class TeacherGather implements Gather {

    public Object info() {
        String teacherName = InputUtil.requireText("Enter name");
        String teacherSurname = InputUtil.requireText("Enter surname");
        String teacherProf = InputUtil.requireText("Enter prof");
        String subject = InputUtil.requireText("Enter subject");
        QuizForTeacher.quizForum();

        return new Teacher(teacherName, teacherSurname, teacherProf, subject);
    }
}
