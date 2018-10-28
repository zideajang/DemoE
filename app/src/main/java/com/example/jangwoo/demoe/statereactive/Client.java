package com.example.jangwoo.demoe.statereactive;

import com.example.jangwoo.demoe.demos.User;

import java.io.IOException;

public class Client {
    public static void main(String[] args) {
        UserManager um = new UserManagerImpl();
        um.setName("zidea", new UserManager.Listener() {
            @Override
            public void success(User user) {
                System.out.println(um.getUser());
                um.setAge(40, new UserManager.Listener() {
                    @Override
                    public void success(User user) {

                    }

                    @Override
                    public void failure(IOException e) {

                    }
                });
            }

            @Override
            public void failure(IOException e) {

            }
        });
        System.out.println(um.getUser().getName());
        um.setName("jangwoo", new UserManager.Listener() {
            @Override
            public void success(User user) {

            }

            @Override
            public void failure(IOException e) {

            }
        });
        System.out.println(um.getUser().getName());
    }
}
