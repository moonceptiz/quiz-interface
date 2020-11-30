package home.teacher;


import home.gather.Gather;
import home.util.InputUtil;

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
