package com.example.jangwoo.demoe.reactive;

interface ZSubscriber<T> {
    void onNext(T t);
    void onComplete();
    void onError(Throwable t);
    void onSubscribe(ZSubscription s);
}
