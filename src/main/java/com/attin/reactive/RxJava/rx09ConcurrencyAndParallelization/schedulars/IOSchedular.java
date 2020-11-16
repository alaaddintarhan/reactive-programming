package com.attin.reactive.RxJava.rx09ConcurrencyAndParallelization.schedulars;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class IOSchedular {

    public static void main(String[] args) throws InterruptedException {

        Observable source = Observable.just("Pasta", "Pizza","Fries","Curry","Chow mein")
                .subscribeOn(Schedulers.io());

        System.out.println("Schedulers.io() uses as many threads as number of the observers");
        System.out.println("AvailableProcessors : "+Runtime.getRuntime().availableProcessors());

        source.subscribe(e  -> ioOperation(e));
        source.subscribe(e  -> ioOperation(e));
        source.subscribe(e  -> ioOperation(e));
        source.subscribe(e  -> ioOperation(e));
        source.subscribe(e  -> ioOperation(e));
        source.subscribe(e  -> ioOperation(e));
        source.subscribe(e  -> ioOperation(e));
        source.subscribe(e  -> ioOperation(e));
        source.subscribe(e  -> ioOperation(e));
        source.subscribe(e  -> ioOperation(e));
        source.subscribe(e  -> ioOperation(e));
        source.subscribe(e  -> ioOperation(e));

        Thread.sleep(3000);
    }

    private static void ioOperation(Object e) throws InterruptedException {

        Thread.sleep(1000);
        System.out.println(e+", io Done By "+Thread.currentThread().getName());
    }
}
