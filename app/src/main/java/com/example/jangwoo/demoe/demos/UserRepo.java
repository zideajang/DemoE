package com.example.jangwoo.demoe.demos;

import java.util.Arrays;
import java.util.List;

public class UserRepo {

    List<User> findAll(){
        return Arrays.asList(new User("tina","translator"),
            new User("matthew","developer")
        );
    }
}
