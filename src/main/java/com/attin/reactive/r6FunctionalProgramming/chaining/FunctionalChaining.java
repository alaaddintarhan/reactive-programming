package com.attin.reactive.r6FunctionalProgramming.chaining;


public class FunctionalChaining {

    public static void main(String[] args) {

        Consumer<String> c1 = s -> System.out.println("c1 : "+s);
        Consumer<String> c2 = s -> System.out.println("c2 : "+s);

        c1.accept("first");
        c2.accept("second");

        Consumer<String> c3 = s -> {
            c1.accept(s);
            c1.accept(s);
        };
        c3.accept("Hello");

        Consumer<String> c4 = c1.thenAccept(c2);
        c4.accept("my functional interface...");

        Consumer<String> nullConsumer = c1.thenAccept(null);
    }
}
