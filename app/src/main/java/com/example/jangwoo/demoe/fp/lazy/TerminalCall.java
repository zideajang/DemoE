package com.example.jangwoo.demoe.fp.lazy;

public class TerminalCall<T> implements TailCall<T> {

    private final T result;

    public TerminalCall(T result) {
        this.result = result;
    }

    @Override
    public boolean isComplete() {
        return true;
    }

    @Override
    public T result() {
        return result;
    }

    @Override
    public TailCall<T> get() {
        throw new UnsupportedOperationException();
    }
}
