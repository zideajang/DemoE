package com.example.jangwoo.demoe.fp.lazy;

import android.annotation.SuppressLint;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.nio.file.Paths.get;


public class LessonThree {



    @SuppressLint("NewApi")
    public static void main(String[] args) {
        List<String> errors = new ArrayList<>();
        int errorCount = 0;
        File file = new File("demo.txt");
//        String line =  file.readLine();

        try {

            System.out.println("read demo.txt");
            errors = Files.lines(Paths.get("demo.txt"))

                    .filter(l -> l.startsWith("ERROR"))
                    .limit(40)
                    .collect(Collectors.toList());

            for(String error:errors){
                System.out.println("error");
                System.out.println(error);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
