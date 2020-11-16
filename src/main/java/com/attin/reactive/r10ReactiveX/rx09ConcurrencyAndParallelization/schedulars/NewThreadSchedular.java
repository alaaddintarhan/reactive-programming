package com.attin.reactive.r10ReactiveX.rx09ConcurrencyAndParallelization.schedulars;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class NewThreadSchedular {

    public static void main(String[] args) throws InterruptedException {

        Observable source = Observable.just("Pasta", "Pizza","Fries","Curry","Chow mein")
                .subscribeOn(Schedulers.newThread());

        System.out.println("Schedulers.newThread() uses  new thread per observer");
        System.out.println("AvailableProcessors : "+Runtime.getRuntime().availableProcessors());

        source.subscribe(e  -> ioOperation(e));

        Thread.sleep(6000);

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
        System.out.println(e+", newThread Done By "+Thread.currentThread().getName());
    }
}
