package com.example.jangwoo.demoe.fp.lazy;

import java.util.stream.IntStream;

public class LessonSix {

    static IntStream numbers(){
        return IntStream.iterate(2, n -> n + 1);
    }

    static int head(IntStream numbers){
        return numbers.findFirst().getAsInt();
    }

    static IntStream tail(IntStream numbers){
        return numbers.skip(1);
    }

    static IntStream primes(IntStream numbers){
        int head = head(numbers);
        return IntStream.concat(IntStream.of(head),
                primes(tail(numbers).filter(n -> n % head != 0)));
    }
}
