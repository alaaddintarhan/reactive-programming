package com.attin.reactive.r10RxJava.rx01;

import io.reactivex.Observable;

public class rx01HelloRxJava {

    public static void main(String[] args) {

        Observable<String> observable = Observable.create(observableEmitter -> {
            observableEmitter.onNext("Hello");
            observableEmitter.onNext("RxJava");
        });

        observable.subscribe(s -> {System.out.printf("\nObserver-1: %s",s);});
        observable.subscribe(s -> {System.out.printf("\nObserver-2: %s",s);});
    }
}
