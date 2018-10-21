package com.example.jangwoo.demoe;



public class Singleton {
    private static Singleton singleton;
    private Callback callback;

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public Callback getCallback() {
        return callback;
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public interface Callback{
        void callback();
    }
}
