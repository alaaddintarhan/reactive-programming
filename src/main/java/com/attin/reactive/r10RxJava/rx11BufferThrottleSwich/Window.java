package com.attin.reactive.r10RxJava.rx11BufferThrottleSwich;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class Window {

    public static void main(String[] args) throws InterruptedException {


        Observable<Long> interval = Observable.interval(1000, TimeUnit.MILLISECONDS);

        Observable.interval(300, TimeUnit.MILLISECONDS)
                .window(interval)
                .subscribe(System.out::println);

        Thread.sleep(4000);
    }
}
