package com.example.jangwoo.demoe.fp.interior;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class LessonOne {

    public static void main(String[] args) {
//        List<Double> newList = new ArrayList<>();
        List<Integer> integerList = Arrays.asList(1,2,3);
//        for(Integer value:integerList){
//            newList.add(value * 1.2);
//        }

//            for(Integer value:integerList){
//            newList.add(addPercent(value));
//        }

    }

//    List<Double> map(List<Integer> list, Function<Integer,Double> f){
//        List<Double> newList = new ArrayList<>();
//        for(Integer value:list){
//            newList.add(f.apply(value));
//        }
//
//        return newList;
//    }
    <T, U> List<U> map(List<T> list, Function<T, U> f){
        List<U> newList = new ArrayList<>();
        for(T value:list){
            newList.add(f.apply(value));
        }

        return newList;
    }

    Function<Integer,Double> addPercent = x -> x * 1.2;

//    static Double addPercent(Integer value){
//        return value * 1.2;
//    }

}
