package com.example.quizInterface.util;

import java.util.Scanner;

public class InputUtil {
    public static String requireText(String title){
        Scanner sc = new Scanner(System.in);
        System.out.println(title+":" );
        String answer = sc.nextLine();
        return answer;
    }
    public static String  requireNumber(String title){
        Scanner sc = new Scanner(System.in);
        System.out.println(title+":" );
        String answer = sc.nextLine();
        return answer;
    }
}
