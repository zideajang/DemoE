package com.example.jangwoo.demoe.statereactive;

import com.example.jangwoo.demoe.demos.User;

public class UserManagerImpl implements UserManager {

    private User mUser;

    public UserManagerImpl() {
        this.mUser = new User();
    }

    @Override
    public User getUser() {
        return mUser;
    }

    @Override
    public void setName(String name, Listener listener) {

    }

    @Override
    public void setAge(int age, Listener listener) {

    }

}
