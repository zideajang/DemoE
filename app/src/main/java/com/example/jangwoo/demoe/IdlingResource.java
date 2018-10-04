package com.example.jangwoo.demoe;

public interface IdlingResource {

    String getName();
    boolean isIdleNow();
    void registerIdleTransitionCallback(ResourceCallback resourceCallback);

    public interface ResourceCallback {
        void onTransitionToIdle();
    }
}
