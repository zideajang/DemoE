package com.example.jangwoo.demoe.fp.conditions;

import java.util.regex.Pattern;

public class UsernameValidation {

    static final Pattern usernamePattern = Pattern.compile("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$");

    public static void evauluateUsername(String username){
        if(usernamePattern.matcher(username).matches()){
            showMessage("用户名格式正确");
        }else {
            showWarning("用户名格式不正确");
        }
    }

    private static void showMessage(String message) {
        System.out.println("成功：" + message);
    }

    private static void showWarning(String message){
        System.out.println("警告：" + message);
    }


}
