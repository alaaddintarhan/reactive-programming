package com.attin.reactive.r1LamdaAndFunctionalInterface;

public class LamdaUnderTheHood {

    public static void main(String[] args) {
/*
        FirstFunctionalInterface first = new FirstFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("First implementation...");
            }
        };

        FirstFunctionalInterface second = new FirstFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("Second implementation...");
            }
        };
*/
        FirstFunctionalInterface functionalInterface = () -> System.out.println("Hello...");
        functionalInterface.method();

        //pass FunctionalInterface as a parameter
        onTheFly(() -> System.out.println("pass a FunctionalInterface to method as a parameter"));
    }

    private static void onTheFly(FirstFunctionalInterface functionalInterface) {
        functionalInterface.method();
    }

}
