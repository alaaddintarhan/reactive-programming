package com.attin.reactive.r10ReactiveX.rx11BufferThrottleSwich;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

public class Window {

    public static void main(String[] args) throws InterruptedException {


        Observable<Long> interval = Observable.interval(1000, TimeUnit.MILLISECONDS);

        Observable.interval(300, TimeUnit.MILLISECONDS)
                .window(interval)
                .subscribe(System.out::println);

        Thread.sleep(4000);
    }
}
