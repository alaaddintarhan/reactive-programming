package com.attin.reactive.RxJava.rx05CombiningObservables;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class Concat {

    public static void main(String[] args) throws InterruptedException {

        /**
         * Observable.concat
         */
        System.out.println("********************** concat ************");

        Observable<String> source1 = Observable.interval(1, TimeUnit.SECONDS).map(e -> "src1 : " + e);
        Observable<String> source2 = Observable.interval(1, TimeUnit.SECONDS).map(e -> "src2 : " + e);

        Observable.concat(source1, source2)
                .subscribe(System.out::println);

        Thread.sleep(5000);
    }
}
