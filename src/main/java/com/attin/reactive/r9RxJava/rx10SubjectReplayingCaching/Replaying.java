package com.attin.reactive.r9RxJava.rx10SubjectReplayingCaching;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class Replaying {

    public static void main(String[] args) throws InterruptedException {

        Observable<Long> src = Observable.interval(1, TimeUnit.SECONDS)
                .replay(2,5,TimeUnit.SECONDS) // the buffer size that limits the number of items that can be replayed
                //.replay(2,TimeUnit.SECONDS)
               // .replay(2)
                .autoConnect();

        src.subscribe(e -> System.out.println("Observer - 1 : "+e + " , "+Thread.currentThread().getName()) );
        Thread.sleep(5000);


        src.subscribe(e -> System.out.println("--> Observer - 2 : "+e + " , "+Thread.currentThread().getName()) );
        Thread.sleep(3000);

    }
}
