package com.example.jangwoo.demoe.statereactive;

import com.example.jangwoo.demoe.demos.User;

import java.io.IOException;

public interface UserManager {

    User getUser();
    void setName(String name, Listener listener);
    void setAge(int age,Listener listener);

    interface Listener{
        void success(User user);
        void failure(IOException e);
    }
}
