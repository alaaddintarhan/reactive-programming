package com.attin.reactive.r3FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FI03Cunsumer {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Consumer<Integer> cuns = integer -> System.out.println(integer);
        cuns.accept(5);


        Consumer<List<Integer>> cunss = integer -> System.out.println(integer);
        cunss.accept(list);

    }
}
