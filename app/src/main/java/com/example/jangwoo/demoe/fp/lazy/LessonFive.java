package com.example.jangwoo.demoe.fp.lazy;

import java.util.stream.IntStream;

public class LessonFive {

    public IntStream primes(int n){
        return IntStream.iterate(2, i -> i + 1)
                .filter(this::isPrime)
                .limit(n);
    }

    private boolean isPrime(int candidate) {
        return IntStream
                .rangeClosed(2,(int)Math.sqrt(candidate))
                .noneMatch( i -> candidate % i == 0);
    }

    public static void main(String[] args) {

        LessonFive lessonFive = new LessonFive();
        lessonFive.primes(10)
            .forEach(i -> System.out.println(i));

    }
}
