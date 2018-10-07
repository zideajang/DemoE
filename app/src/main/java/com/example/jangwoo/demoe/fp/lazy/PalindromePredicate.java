package com.example.jangwoo.demoe.fp.lazy;

import java.util.function.Predicate;

import static java.lang.Character.isLetter;
import static java.lang.Character.toLowerCase;

public class PalindromePredicate implements Predicate<String>{
    @Override
    public boolean test(String s) {
        return false;
    }

    private boolean isPalindrome(String s, int start, int end){
        while (start < end && !isLetter(s.charAt(start))) {
            start++;
        }
        while (start < end && !isLetter(s.charAt(end))) end--;
        if(start >= end) return true;
        if(toLowerCase(s.charAt(start)) != toLowerCase(s.charAt(end))) return false;
        return isPalindrome(s,start+1, end-1);
    }
}
