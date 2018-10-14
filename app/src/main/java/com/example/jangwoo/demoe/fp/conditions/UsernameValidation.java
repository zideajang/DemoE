package com.example.jangwoo.demoe.fp.conditions;

import java.util.function.Function;
import java.util.regex.Pattern;

public class UsernameValidation {

    static final Pattern usernamePattern = Pattern.compile("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$");

    public static  Function<String,Result> usernameChecker = s ->
//            s == null
//                ? new Result.Failure("用户名不能为 null")
//                    : s.length() == 0
//                        ? new Result.Failure("用户名不能为空")
//                        : usernamePattern.matcher(s).matches()
//                            ? new Result.Success()
//                            : new Result.Failure("用户名格式不正确");
    {
        if(s == null){
            return Result.failure("用户名不能为 null");
        }else if(s.length() == 0){
            return Result.failure("用户名不能为空");
        }else if(usernamePattern.matcher(s).matches()){
            return Result.success(s);
        }else {
            return Result.failure("用户名格式不正确");
        }
    };


//    public static void evauluateUsername(String username){
//        if(usernamePattern.matcher(username).matches()){
//            showMessage("用户名格式正确");
//        }else {
//            showWarning("用户名格式不正确");
//        }
//    }

    static Effect<String> success = s -> System.out.println("用户名格式正确");
    static Effect<String> failure = s -> System.out.println("警告：" + s);

//    private static void showMessage(String message) {
//        System.out.println("成功：" + message);
//    }

//    private static void showWarning(String message){
//        System.out.println("警告：" + message);
//    }


//    public static Executable evauluateUsernameFP(String s){
//        Result result = usernameChecker.apply(s);
//
//        return (result instanceof Result.Success) ?
//                () -> showMessage("用户名格式正确")
//                : () -> showWarning( ((Result.Failure)result).getErrorMessage());
////        if(result instanceof Result.Success){
////            showMessage("用户名格式正确");
////        }else {
////            showWarning(((Result.Failure)result).getErrorMessage());
////        }
//    }
}
