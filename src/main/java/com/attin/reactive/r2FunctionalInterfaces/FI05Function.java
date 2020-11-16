package com.attin.reactive.r2FunctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FI05Function {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Kit", "Kat", "Shake");

        Function<String, Integer> function = s -> s.length();
        List<Integer> intList = map(list, function);
        System.out.println(intList);

        //a shorter way
        List<Integer> intListWithOneLine = list.stream().map(str -> str.length()).collect(Collectors.toList());
        System.out.println(intListWithOneLine);

    }

    private static <T,K, R> List<R> map(List<T> list, Function<T, R> function) {
        return list.stream().map(s -> function.apply(s)).collect(Collectors.toList());
    }

    private static <T, R> List<R> map2(List<T> list, Function<T, R> function) {
        List<R> rList = new ArrayList<>(list.size());
        for (T t : list) {
            rList.add(function.apply(t));
        }
        return rList;
    }
}
