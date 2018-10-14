package com.example.jangwoo.demoe.fp.interior;

import java.util.List;
import java.util.function.Function;


import static com.example.jangwoo.demoe.fp.interior.CollectionUtilities.*;

public class LessonTwo {

    static String addSI(String s, Integer i){
        return "(" + s + " + " + i + ")";
    }

    public static void main(String[] args) {
        System.out.println("----");
        List<Integer> listOne = list(1,2,3,4,5);

        String identity = "0";

        Function<String, Function<Integer,String>> f = x -> y -> addSI(x,y);

        String result = foldLeft(listOne,identity,f);

        System.out.println(result);
    }
}
