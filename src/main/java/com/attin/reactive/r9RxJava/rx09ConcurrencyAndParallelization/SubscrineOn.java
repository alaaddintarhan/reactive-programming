package com.attin.reactive.r9RxJava.rx09ConcurrencyAndParallelization;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class SubscrineOn {

    public static void main(String[] args) throws InterruptedException {

        Observable.just("Pasta", "Fries","Pizza","Curry","Chow mein")
                .subscribeOn(Schedulers.computation())
                .map(s-> s.toUpperCase())
                .doOnNext(s->System.out.println(Thread.currentThread().getName()))
                .observeOn(Schedulers.newThread())
                .filter(s-> s.startsWith("P"))
                .observeOn(Schedulers.io())
                .subscribe(e -> print(e));

        Thread.sleep(6000);
    }

    private static void print(String e) {
        System.out.println(e +" : Printed By : " +Thread.currentThread().getName());
    }
}
