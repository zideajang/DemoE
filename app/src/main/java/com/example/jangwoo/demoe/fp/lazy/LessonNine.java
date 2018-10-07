package com.example.jangwoo.demoe.fp.lazy;

public class LessonNine {

    public static int sumAllOne(int n){
        return n == 0?
                0:
                n + sumAllOne(n - 1);
    }


}
