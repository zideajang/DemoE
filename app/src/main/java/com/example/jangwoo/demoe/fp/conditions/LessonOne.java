package com.example.jangwoo.demoe.fp.conditions;

import static com.example.jangwoo.demoe.fp.conditions.UsernameValidation.failure;
import static com.example.jangwoo.demoe.fp.conditions.UsernameValidation.success;

public class LessonOne {
    public static void main(String[] args) {

        UsernameValidation.usernameChecker.apply("zidea2015@163.com")
                .bind(success,failure);

        UsernameValidation.usernameChecker.apply("zidea2015@163.com").bind(success,failure);
        UsernameValidation.usernameChecker.apply(null).bind(success,failure);
        UsernameValidation.usernameChecker.apply("123").bind(success,failure);

    }
}
