package com.attin.reactive.r10RxJava.rx01;

import io.reactivex.Observable;

import java.util.ArrayList;

public class rx05ColdObservable {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(16);
        list.add(17);

        Observable observable = Observable.fromIterable(list);

        observable.subscribe(System.out::println);

        list.add(18);
        observable.subscribe(System.out::println);


    }
}
