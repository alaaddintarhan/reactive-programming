package com.attin.reactive.r9Collector.customCollector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

public class CustomCollector {

    public static void main(String[] args) {

/**
 public interface Collector<T, A, R> {

 Supplier<A> supplier();
 BiConsumer<A, T> accumulator();
 BinaryOperator<A> combiner();
 Function<A, R> finisher();
 Set<java.util.stream.Collector.Characteristics> characteristics();

 of(...)  : returns  <T, R> Collector<T, R, R>

 }
 */
        List<Integer> numbers = List.of(2, 6, 8, 9, 0, 1, 52, 5, 61, 8, 9, 96, 0, 18, 23);

        //Collector toList = Collector.of(supplier,accumulator,combiner,characteristic);

        //supplier, accumulator, combiner, cs
        Collector<Integer, List<Integer>, List<Integer>> toList = Collector.of(
                ArrayList::new // supplier
                , (list, e) -> list.add(e) //accumulator: BiConsumer
                , (list1, list2) -> { //BiFunction combiner is used to merge the partial result from different threads
                    list1.addAll(list2);
                    return list1;
                }
                , Collector.Characteristics.IDENTITY_FINISH// characteristic
        );

        List<Integer> even = numbers.stream()
                .filter(e -> e % 2 == 0)
                .collect(toList);

        even.forEach(System.out::println);

        System.out.println("------X-------X-------X------X------X-----X------");

        Collector.Characteristics df;
        Collector<Integer, List<Integer>, List<Integer>> toSortedList
                = Collector.of(
                                                    ArrayList::new // supplier
                                                    , (list, e) -> list.add(e) //accumulator: BiConsumer
                                                    , (list1, list2) -> { //BiFunction combiner is used to merge the partial result from different threads
                                                        list1.addAll(list2);
                                                        return list1;
                                                    },
                                                    list -> {
                                                         Collections.sort(list);
                                                         return  list;
                                                    }
                                                    ,  Collector.Characteristics.UNORDERED
        );

        List<Integer> sortedList = numbers.stream().collect(toSortedList);
        sortedList.forEach(System.out::println);

    }
}
