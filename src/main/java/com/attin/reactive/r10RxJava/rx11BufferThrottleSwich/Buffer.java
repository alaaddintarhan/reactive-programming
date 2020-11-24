package com.attin.reactive.r10RxJava.rx11BufferThrottleSwich;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

public class Buffer {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("\n*********** buffer count ***************");
        Observable.range(1, 12)
                .buffer(5)// the maximum number of items in each buffer before it should be emitted
                .subscribe(s-> System.out.println(s.getClass()+" : "+s));

        System.out.println("\n*********** with  skip :8 ***************");
        Observable.range(1, 12)
                .buffer(5, 8)
                .subscribe(s-> System.out.println(s.getClass()+" : "+s));


        System.out.println("\n\n********** buffer timespan ***************");
        Observable<List<Long>> longSource = Observable.interval(500, TimeUnit.MILLISECONDS)
                .buffer(1, TimeUnit.SECONDS);

        Disposable longDisposable = longSource.subscribe(System.out::println);
        Thread.sleep(4000);
        longDisposable.dispose();

        System.out.println("\n********** buffer timespan and count***************");

        long started = System.currentTimeMillis();
        Disposable subscribe = Observable.interval(300, TimeUnit.MILLISECONDS)
                .buffer(1, TimeUnit.SECONDS, 2)
                 .subscribe(s->System.out.println(s+" - x t: "+(System.currentTimeMillis()-started)));


        Thread.sleep(4000);
        subscribe.dispose();


        System.out.println("\n********** buffer with boundary***************");

        /**
         *  time line  for emited items
         *
         * time     :   0---------------1----------------2----------------3----------------4
         * boundary :   0------0,5------1------1,5-------2-------2,5------3------3,5-------4
         *                          []   [0]     []       [1]       []   [2]       []
         */

        Long  started2 = System.currentTimeMillis();
        Observable<Long> interval = Observable.interval(1000, TimeUnit.MILLISECONDS);
        Disposable disposable = Observable.interval(300, TimeUnit.MILLISECONDS)
                .buffer(interval)
                .subscribe(s->System.out.println(s+" - y t: "+(System.currentTimeMillis()-started2)));
        Thread.sleep(4000);
        disposable.dispose();;
    }
}
