package com.attin.reactive.r3FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FI02Predicate {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("a1", "b","", "d1","  a--");

        java.util.function.Predicate<String> nonNullPredicate = str -> Objects.nonNull(str);
        List<String> filteredList = filter(list, nonNullPredicate);
        System.out.println(filteredList);

        java.util.function.Predicate<String> contains1Predicate = str -> str.contains("1");
        List<String> filteredList2 = filter(list, contains1Predicate);
        System.out.println(filteredList2);


        List<String> filteredList3 = filter(list, str -> str.contains("a"));
        System.out.println(filteredList3);

    }

    private static List<String> filter(List<String> pureList, java.util.function.Predicate<String> predicate) {
        return pureList.stream().filter(predicate).collect(Collectors.toList());
    }
}
