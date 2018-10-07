package com.example.jangwoo.demoe.fp.lazy;

import java.util.stream.IntStream;

public class LessonTwo {

    public static void main(String[] args) {
        /**
         * 记得多年以前了解 es6 的 generator 新的特性时，只是了解其大概，其实当时并不是完全
         * 了解 genertor ，以及 generator 与 for while 这样对数组的遍历有什么本质不同，当有人问我
         * 我也能默默一笑而过，不过今天我才真正了解到 generator 的用途和他的威力。
         *
         */
        IntStream.iterate( 1, i -> i + 1)
                .map(i -> i * 2)
                .filter( i -> i > 5)
                .findFirst();
    }
}
