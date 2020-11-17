package com.attin.reactive.r9RxJava.rx01;

import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;

import java.util.concurrent.TimeUnit;

public class rx06ConnectableObservable {
    public static void main(String[] args) throws InterruptedException {


        ConnectableObservable<Long> source = Observable.interval(1, TimeUnit.SECONDS).publish();

        source.connect();

        //first subscriber
        source.subscribe(System.out::println);

        Thread.sleep(10000);

        //second subscriber
        source.subscribe(System.out::println);

        Thread.sleep(10000);
    }
}
