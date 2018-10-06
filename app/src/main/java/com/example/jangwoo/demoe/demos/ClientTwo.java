package com.example.jangwoo.demoe.demos;

import java.util.function.Supplier;

public class ClientTwo {

    public static void main(String[] args) {
        Supplier<String> nameOne =  new Supplier<String>() {
            @Override
            public String get() {
                return new String("zidea");

            }
        };

        System.out.println(nameOne.get());


        Supplier<String> nameTwo = () -> {
            return new String("zidea two");
        };

        System.out.println(nameTwo.get());

        Supplier<String> nameThree = () -> "zidea three";

        System.out.println(nameThree.get());

    }


}
