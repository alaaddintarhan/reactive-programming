package com.attin.reactive.r8Spliterator;

import java.util.ArrayList;
import java.util.Spliterator;

public class Characteristic {

    /**
     * Spliterator Characteristics
     * <p>
     * SIZED – if it's capable of returning an exact number of elements with the estimateSize() method
     * SORTED – if it's iterating through a sorted source
     * SUBSIZED – if we split the instance using a trySplit() method and obtain Spliterators that are SIZED as well
     * CONCURRENT – if source can be safely modified concurrently
     * DISTINCT – if for each pair of encountered elements x, y, !x.equals(y)
     * IMMUTABLE – if elements held by source can't be structurally modified
     * NONNULL – if source holds nulls or not
     * ORDERED – if iterating over an ordered sequence
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(0);
        list.add(1);

        Spliterator<Integer> spliterator = list.stream().spliterator();
        int bits = spliterator.characteristics();

        System.out.println(Integer.bitCount(bits));

        //OR
        System.out.println(Integer.bitCount(bits | 0x00000010));

        //AND
        System.out.println(bits & 0x00000010);

        System.out.println(spliterator.hasCharacteristics(0x00000010));
    }
}
