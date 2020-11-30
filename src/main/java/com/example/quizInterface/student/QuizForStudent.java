package com.example.quizInterface.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import com.example.quizInterface.util.InputUtil;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuizForStudent extends Student {

    private String quizTheme;
    private String quizLevel;
    private String quizTime;


    public static void quizForum() {
        String quizTheme = InputUtil.requireText("Enter quiz Theme");
        String quizLevel = InputUtil.requireText("Enter quiz Level");
        String quizTime = InputUtil.requireText("Enter quiz Time");
        QuizForStudent quizForStudent = new QuizForStudent(quizTheme, quizLevel, quizTime);
    }
}
