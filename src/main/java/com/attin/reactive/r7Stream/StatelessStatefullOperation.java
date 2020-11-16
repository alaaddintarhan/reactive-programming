package com.attin.reactive.r7Stream;

import java.util.List;
import java.util.stream.Collectors;

public class StatelessStatefullOperation {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> collect = list
                .parallelStream()
                .skip(2)//statefull terminal operator : we need to avoid using parallel  when we are going to work  such  methods
                .limit(5).collect(Collectors.toList());

        collect.forEach(System.out::println);
    }
}
