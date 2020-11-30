package controller;

import com.example.quizInterface.service.TeacherService;
import com.example.quizInterface.teacher.Teacher;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

@Repository
@RequiredArgsConstructor
public class TeacherController {

    private final TeacherService teacherService;

    @GetMapping("/teachers")
    public Teacher teacher(Teacher teacher){
        return teacher;
    }
}
