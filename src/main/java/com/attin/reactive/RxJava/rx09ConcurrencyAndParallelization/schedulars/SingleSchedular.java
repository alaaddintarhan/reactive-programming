package com.attin.reactive.RxJava.rx09ConcurrencyAndParallelization.schedulars;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class SingleSchedular {

    public static void main(String[] args) throws InterruptedException {

        Observable source = Observable.just("Pasta", "Pizza","Fries","Curry","Chow mein")
                .subscribeOn(Schedulers.single());

        System.out.println("Schedulers.single() uses  just one thread for all observer");
        System.out.println("AvailableProcessors : "+Runtime.getRuntime().availableProcessors());

        source.subscribe(e  -> ioOperation(e));
        source.subscribe(e  -> ioOperation(e));
        source.subscribe(e  -> ioOperation(e));
        source.subscribe(e  -> ioOperation(e));
        source.subscribe(e  -> ioOperation(e));
        source.subscribe(e  -> ioOperation(e));
        source.subscribe(e  -> ioOperation(e));
        source.subscribe(e  -> ioOperation(e));

        Thread.sleep(4000);
    }

    private static void ioOperation(Object e) throws InterruptedException {

        Thread.sleep(1000);
        System.out.println(e+", newThread Done By "+Thread.currentThread().getName());
    }
}
