package com.attin.reactive.RxJava.rx09ConcurrencyAndParallelization.schedulars;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class ComputationSchedular {

    public static void main(String[] args) throws InterruptedException {

        Observable source = Observable.just("Pasta", "Pizza","Fries","Curry","Chow mein")
                .subscribeOn(Schedulers.computation());

        System.out.println("Schedulers.computation() uses as many threads as number of the available cpu.");
        System.out.println("AvailableProcessors : "+Runtime.getRuntime().availableProcessors());

        source.subscribe(e  -> compute(e));
        source.subscribe(e  -> compute(e));
        source.subscribe(e  -> compute(e));
        source.subscribe(e  -> compute(e));
        source.subscribe(e  -> compute(e));
        source.subscribe(e  -> compute(e));
        source.subscribe(e  -> compute(e));
        source.subscribe(e  -> compute(e));
        source.subscribe(e  -> compute(e));
        source.subscribe(e  -> compute(e));
        source.subscribe(e  -> compute(e));
        source.subscribe(e  -> compute(e));

        Thread.sleep(3000);
    }

    private static void compute(Object e) throws InterruptedException {

        Thread.sleep(1000);
        System.out.println(e+", Computation Done By "+Thread.currentThread().getName());
    }
}
