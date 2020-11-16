package com.attin.reactive.r2;

public class Demo {

    public static void main(String[] args) {

        MathOperation add = (a, b) -> System.out.println(a + b);
        add.operation(5, 9);

        MathOperation multiply = (a, b) -> System.out.println(a * b);
        multiply.operation(5, 8);

        LengthOfString lengthOfString = str -> str.length();
        System.out.println(lengthOfString.length("asdfasdfasfdsa"));

        LengthOfString lengthOfString2 = str -> {
            int length = str.length();
            System.out.println(lengthOfString.length("lengthOfString2 : "+length));
            return length;
        };

    }

}
