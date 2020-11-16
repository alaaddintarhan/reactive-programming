package com.attin.reactive.r3FunctionalInterfaces;

import java.util.function.BiFunction;

public class FI06BiFunction {

    public static void main(String[] args) {

        BiFunction<String, String, Integer> biFunction = (x, y) -> x.length() + y.length();

        System.out.println(biFunction.apply("Attin", "Heyyoooo"));
    }

}
