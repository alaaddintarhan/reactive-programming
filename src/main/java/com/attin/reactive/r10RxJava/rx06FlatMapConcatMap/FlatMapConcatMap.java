package com.attin.reactive.r10RxJava.rx06FlatMapConcatMap;

import java.util.List;

import io.reactivex.Observable;

public class FlatMapConcatMap {

    public static void main(String[] args) {

        List<String> list = List.of("Hello" ,"Reactive", "Programming");

        Observable.fromIterable(list)
                .flatMap(s -> Observable.fromArray(s.split("")))
                .subscribe(System.out::println);

        System.out.println("**********************************");

        Observable.fromIterable(list)
                .concatMap(s -> Observable.fromArray(s.split("")))
                .subscribe(System.out::println);

    }
}
