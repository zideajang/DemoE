package com.example.jangwoo.demoe.fp.conditions;

import java.util.function.Function;
import java.util.regex.Pattern;

public class UsernameValidation {

    static final Pattern usernamePattern = Pattern.compile("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$");

    static final Function<String,Result> usernameChecker = s -> {
        if(s == null){
            return new Result.Failure("用户名不能为 null");
        }else if(s.length() == 0){
            return new Result.Failure("用户名不能为空");
        }else if(usernamePattern.matcher(s).matches()){
            return new Result.Success();
        }else {
            return new Result.Failure("用户名格式不正确");
        }
    };

    public static void evauluateUsernameFP(String s){
        Result result = usernameChecker.apply(s);
        if(result instanceof Result.Success){
            showMessage("用户名格式正确");
        }else {
            showWarning(((Result.Failure)result).getErrorMessage());
        }
    }

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
