package com.attin.reactive.r3CunstructorReference;

import java.util.function.Function;

public class CunstructorReference {

    public static void main(String[] args) {

        //class instance reference
        Function<Runnable, Thread> threadGenerator = Thread::new;

        Runnable runnable = () -> System.out.println("Task-1 Executed ...");
        Runnable runnable2 = () -> System.out.println("Task-2 Executed ...");

        threadGenerator.apply(runnable).start();
        threadGenerator.apply(runnable2).run();
    }
}
