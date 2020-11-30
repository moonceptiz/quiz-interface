package com.example.quizInterface.service;

import com.example.quizInterface.teacher.Teacher;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    public Teacher findAllTeachers(Teacher teacher){
        return teacher;
    }
}
