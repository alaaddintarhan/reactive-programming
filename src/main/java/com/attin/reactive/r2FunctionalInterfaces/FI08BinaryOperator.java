package com.attin.reactive.r2FunctionalInterfaces;

import java.util.function.BinaryOperator;

public class FI08BinaryOperator {

    public static void main(String[] args) {

        BinaryOperator<String> binaryOperator = (x, y) -> x.concat(y);
        System.out.println(binaryOperator.apply("attin", " hwyooooo"));

    }
}
