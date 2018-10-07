package com.example.jangwoo.demoe.refactoring;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LessonOne {
    /**
     * 1.
     */
    //minizer error

    /**
     * Safety check
     *
     * readability
     * Fewer lines of code
     * Performance
     * Learning
     *
     * limit the scope
     *
     * //mongodb/morphia github
     */

    /**
     * Automatic refactoring
     *
     * predicate
     * comparator
     * runnable
     * etc
     */

    public static void main(String[] args) {

        //create the pool
        ExecutorService service = Executors.newFixedThreadPool(10);
        for(int i =0; i < 100; i++){
            service.execute(new Task());
        }

        Future<Integer> future = service.submit(new TaskTwo());

        //1 sec
//        Integer result = future.get(); // blocking
    }

    static class TaskTwo implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            Thread.sleep(3000);
            return new Random().nextInt();
        }
    }

    static class Task implements Runnable{

        @Override
        public void run() {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
        }
    }
}
