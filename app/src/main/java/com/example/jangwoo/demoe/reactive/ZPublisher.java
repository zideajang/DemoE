package com.example.jangwoo.demoe.reactive;

public interface ZPublisher<T> {
    void subcribe(ZSubscriber<? super T> s);
}
