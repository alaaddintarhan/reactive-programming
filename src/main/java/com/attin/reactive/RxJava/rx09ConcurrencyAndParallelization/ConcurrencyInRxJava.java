package com.attin.reactive.RxJava.rx09ConcurrencyAndParallelization;

import io.reactivex.Observable;

public class ConcurrencyInRxJava {

    public static void main(String[] args) {

        Observable<String> source = Observable.create(
                e -> {
                    new Thread(() ->
                    {
                        e.onNext("Hello ");
                        e.onNext("RxJava...");
                    }
            ).start();
        });

        source.subscribe(e -> System.out.printf("\nObserver-1 :   %s -- Thread Name: %s",e,Thread.currentThread().getName()));
        source.subscribe(e -> System.out.printf("\nObserver-2 :   %s -- Thread Name: %s",e,Thread.currentThread().getName()));


    }
}
