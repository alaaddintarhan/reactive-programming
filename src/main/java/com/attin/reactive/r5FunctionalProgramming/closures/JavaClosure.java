package com.attin.reactive.r5FunctionalProgramming.closures;


public class JavaClosure {

    public static void main(String[] args) {

        int val = 11;

        Task lamda = () -> {
            //Variable used in lambda expression should be final or effectively final
           // val = 123;

            System.out.println("Task is completed...  : "+val);
        };

        print(lamda);
    }

    private static void print(Task task) {
        task.doTask();;
    }
}
