package com.example.jangwoo.demoe.fp.currying;

public class Demo {

    static String myLog(String data, String type, String message){
        return data + ":" + type + ":" + message;
    }

    static String myWarningLog(String data, String message){
        return data + ":warning:" + message;
    }

    public static void main(String[] args) {
        System.out.println(myLog("2018-10","warning","avoidable error"));
    }
}
