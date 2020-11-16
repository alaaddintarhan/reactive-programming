package com.attin.reactive.r9Spliterator;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Collector;
import java.util.stream.IntStream;

public class Characteristic {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(0);
        list.add(1);

        Spliterator<Integer> spliterator = list.stream().spliterator();
        System.out.printf("\nspliterator.characteristics(): %s", Integer.bitCount(spliterator.characteristics()));

    }
}
