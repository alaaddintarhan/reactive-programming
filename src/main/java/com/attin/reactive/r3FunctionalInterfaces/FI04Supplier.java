package com.attin.reactive.r3FunctionalInterfaces;

import java.util.function.Supplier;

public class FI04Supplier {

    public static void main(String[] args) {

        Supplier<Integer> supplier = () ->  Integer.valueOf(10);
        Integer x = supplier.get();


        System.out.println(x);

    }
}
