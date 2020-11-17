package com.attin.reactive.r9RxJava.rx11BufferThrottleSwich;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class Throttle {

    public static void main(String[] args) throws InterruptedException {

        Observable<String> source = Observable.create(emitter -> {
            emitter.onNext("A");

            Thread.sleep(100);
            emitter.onNext("B");

            Thread.sleep(100);
            emitter.onNext("C");

            Thread.sleep(100);
            emitter.onNext("D");

            Thread.sleep(100);
            emitter.onNext("E");

            Thread.sleep(100);
            emitter.onNext("F");

            Thread.sleep(100);
            emitter.onNext("G");

            Thread.sleep(100);
            emitter.onNext("H");

            emitter.onComplete();
            ;
        });

        System.out.println("***** throttle first *********");
        source.throttleFirst(250, TimeUnit.MILLISECONDS)
                .subscribe(s -> System.out.println("onNext :" + s),
                        throwable -> throwable.printStackTrace(),
                        () -> System.out.println("onComplete"));

        System.out.println("***** throttle sample *********");
        source.throttleLast(250, TimeUnit.MILLISECONDS)
                .subscribe(s -> System.out.println("onNext :" + s),
                        throwable -> throwable.printStackTrace(),
                        () -> System.out.println("onComplete"));

        // The timer resets on each emission.
        // source.debounce(1000,TimeUnit.MILLISECONDS)

        System.out.println("***** throttleWithTimeout *********");
        source.throttleWithTimeout(300,TimeUnit.MILLISECONDS)
                .subscribe(System.out::println);
    }
}
