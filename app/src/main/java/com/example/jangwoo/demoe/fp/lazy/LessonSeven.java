package com.example.jangwoo.demoe.fp.lazy;

import java.util.stream.IntStream;

public class LessonSeven {

    public static int sumAll(int n){

        return IntStream.rangeClosed(0,n).sum();
    }

    public static int oldWay(int n){
        int result = 0;
        for(int i = 0; i <= n; i++){
            result += i;
        }

        return result;
    }



    public static void main(String[] args) {

    }
}
