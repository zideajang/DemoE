package com.example.jangwoo.demoe.fp.lazy;

public class CurryingDemo {


    public static void main(String[] args) {
        BinaryOperator add = x -> y -> x + y;
        BinaryOperator mult = x -> y -> x * y;
        // 3 + 5 = 8
        System.out.println(add.apply(3).apply(5));
    }
}
