package com.attin.reactive.r2FunctionalInterfaces;

public class FI01GenericFunctionalInterface<T, R> {

    public static void main(String[] args) {

        GenericFunctionalInterface<String, String> func1 = str -> str.substring(1,5);
        System.out.println(func1.execute("wowwhello..."));

        GenericFunctionalInterface<String, Integer> func2 = str -> str.length();
        System.out.println(func2.execute("wowwhello..."));

    }
}
