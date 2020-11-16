package com.attin.reactive.r8Spliterator;

import java.util.ArrayList;
import java.util.Spliterator;

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
