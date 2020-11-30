package com.example.quizInterface.teacher;

import com.example.quizInterface.util.InputUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuizForTeacher {
    private String questionType;
    private String quizQuestion;

    public static void quizForum() {
        String questionType = InputUtil.requireText("Enter question Type");
        String quizQuestion = InputUtil.requireText("Enter quiz Question");

        QuizForTeacher quizForTeacher = new QuizForTeacher(questionType, quizQuestion);
    }
}
