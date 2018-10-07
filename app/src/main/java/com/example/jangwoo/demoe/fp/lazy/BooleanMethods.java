package com.example.jangwoo.demoe.fp.lazy;

import java.util.function.Supplier;

public class BooleanMethods {

    public static void main(String[] args) {
        System.out.println(getFirst() || getSecond());
        System.out.println(sor( ()-> getFirst(), ()-> getSecond() ));
    }

    public static boolean getFirst(){
        return true;
    }

    public static boolean getSecond(){
        throw new IllegalStateException();
    }

    public static boolean or(boolean a, boolean b){
        return a ? true : b ? true : false;
    }

    public static boolean and( boolean a, boolean b){
        return a ? b ? true : false : false;
    }

    public static boolean sor(Supplier<Boolean> a, Supplier<Boolean> b){
        return a.get() ? true : b.get() ? true : false;
    }

}
