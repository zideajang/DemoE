package com.example.jangwoo.demoe.reactive;

public interface ZSubscription {
    void request(long n);
    void cancel();
}
