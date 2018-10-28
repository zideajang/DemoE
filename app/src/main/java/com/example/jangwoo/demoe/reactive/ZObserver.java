package com.example.jangwoo.demoe.reactive;


public interface ZObserver<T> {

    void onNext(T t);

    void onComplete();

    void onError(Throwable t);

    void onSubscribe(ZDisposable d);
}