package home.student;

import home.gather.Gather;
import home.util.InputUtil;

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
