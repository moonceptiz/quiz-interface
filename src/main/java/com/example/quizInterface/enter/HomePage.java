package com.example.quizInterface.enter;

import com.example.quizInterface.student.StudentGather;
import com.example.quizInterface.teacher.TeacherGather;
import com.example.quizInterface.gather.GatherInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HomePage {
    private String user;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choose");
        String user = sc.nextLine();
        userForum(user);
    }

    public static void userForum(String user) {


        if (user.equals("student")) {
            GatherInfo.gatherInformation(new StudentGather());
        } else if (user.equals("Teacher")) {
            GatherInfo.gatherInformation(new TeacherGather());
        } else
            System.out.println("Wrong choose!");
    }
}




