package com.example.jangwoo.demoe.fp.abfactory;

import java.util.function.Function;

public class LessonOne {
    public static void main(String[] args) {

//        Bakery danishBakery = topping -> new DanishPastry(topping);
//        Bakery danishBakery =  DanishPastry::new;

        System.out.println("hello abstractor factory");

//        Function<Topping,Pastry> danishBakery = topping -> new DanishPastry(topping);
        Function<Topping,Pastry> danishBakery = DanishPastry::new;
    }
}
