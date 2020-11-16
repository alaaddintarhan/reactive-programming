package com.attin.reactive.RxJava.rx01;

import io.reactivex.Observable;

public class rx04CreatingObserver {

    public static void main(String[] args) {

        Observable<String> observable = Observable.just("Attin","Tarhan","Emel");

//        Action onCompletedAction =  () -> System.out.println("onCompleted..!");
        observable.subscribe( System.out::println  );
        System.out.println();

        observable.subscribe( System.out::println  , Throwable::printStackTrace );
        System.out.println();

        observable.subscribe( System.out::println  , Throwable::printStackTrace , () -> System.out.println("onCompleted..!"));


    }
}
