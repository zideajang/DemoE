package com.example.jangwoo.demoe.fp.conditions;

public class LessonOne {
    public static void main(String[] args) {

        UsernameValidation.evauluateUsername("zidea2015@163.com");
        UsernameValidation.evauluateUsernameFP("zidea2015@163.com");
        UsernameValidation.evauluateUsernameFP(null);
        UsernameValidation.evauluateUsernameFP("123");
    }
}
