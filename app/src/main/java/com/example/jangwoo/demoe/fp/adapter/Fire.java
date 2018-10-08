package com.example.jangwoo.demoe.fp.adapter;

public interface Fire {
    <T> Burnt<T> burn(T thing);
}
