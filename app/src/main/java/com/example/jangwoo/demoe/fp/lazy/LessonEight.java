package com.example.jangwoo.demoe.fp.lazy;

import java.util.Arrays;
import java.util.List;

public class LessonEight {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Dammit, I'm mad!",
                "Rise to vote, sir",
                "Never odd or even",
                "Never odd and even",
                "Was it a car or a car I saw?",
                "was it a car or a dog I saw?"
                );

        sentences.stream()
//                .filter(new PalindromePredicate())
                .filter(new PalindromePredicate())
                .forEach(System.out::print);
    }
}
