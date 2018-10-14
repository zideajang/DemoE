package com.example.jangwoo.demoe.fp.interior;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.function.Function;

import static com.example.jangwoo.demoe.fp.interior.CollectionUtilities.foldLeft;
import static com.example.jangwoo.demoe.fp.interior.CollectionUtilities.list;
import static com.example.jangwoo.demoe.fp.interior.LessonTwo.addSI;
import static org.junit.Assert.*;

public class CollectionUtilitiesTest {

    @Test
    public void shouldPass(){
        Assert.assertEquals(1,1);

    String identity = "0";

        List<Integer> listOne = list(1,2,3,4,5);
    Function<String, Function<Integer,String>> f = x -> y -> addSI(x,y);

    String result = foldLeft(listOne,identity,f);

    }



}