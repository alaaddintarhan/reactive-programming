package com.attin.reactive.r2FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class FI07UnaryOperator {

    public static void main(String[] args) {

        @SuppressWarnings("DuplicatedCode")
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        @SuppressWarnings("DuplicatedCode")
        UnaryOperator<Integer> unaryOperator = inp -> inp * 2;
        List<Integer> newList = list.stream().map(inp -> unaryOperator.apply(inp)).collect(Collectors.toList());
        System.out.println(newList);

        newList = map(list, x -> x*x);
        System.out.println(newList);
    }

    private static <T> List<T> map(List<T> list, UnaryOperator<T> unaryOperator) {

        return list.stream().map(i -> unaryOperator.apply(i)).collect(Collectors.toList());
    }


}
