package com.example.jangwoo.demoe.fp.lazy;

import java.util.function.Supplier;
import java.util.stream.Stream;

@FunctionalInterface
public interface TailCall<T> extends Supplier<TailCall<T>> {
    default boolean isComplete() { return  false; }

    default T result(){
        throw new UnsupportedOperationException();
    }

    default T invoke(){
        return Stream.iterate(this,TailCall::get)
                .filter(TailCall::isComplete)
                .findFirst().get()
                .result();

    }

    static <T> TailCall<T> done(T result){
        return new TerminalCall<T>(result);
    }
}
