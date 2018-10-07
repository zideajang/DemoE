package com.example.jangwoo.demoe.fp.lazy;

import java.util.function.Supplier;

public class LessonOne {

    static <T> T lazyTernary(boolean pred, Supplier<T> first, Supplier<T> second){
        System.out.println("== lazy ===");
        if(pred){
            return first.get();
        }else {
            return second.get();
        }
    }

    static <T> T ternary(boolean pred, T first, T second){
        System.out.println("== stictness ===");
        if(pred){
            return first;
        }else {
            return second;
        }
    }

    static String val1(){
        System.out.println("val1 execute");
        return "first";
    }

    static String val2(){
        System.out.println("val2 execute");
        return "second";
    }

    public static void main(String[] args) {

        boolean bool = true;
        //这是就是 java 这门严格性语言的一些列外，java 最初给我的印象就是中规中矩，严谨甚至呆板，这也是我们
        //当 bool 为 true 只会执行 val1(),而不会执行 val2（）

        String result1 = bool? val1() : val2();
        //这里却不同，在作为参数传入到 ternary
        String result2 =  ternary(bool,val1(),val2());
        //解决方案
        String result3 =  lazyTernary(bool,() -> val1(),() -> val2());
    }

}
