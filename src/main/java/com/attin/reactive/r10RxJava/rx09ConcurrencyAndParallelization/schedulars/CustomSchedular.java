package com.attin.reactive.r10RxJava.rx09ConcurrencyAndParallelization.schedulars;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CustomSchedular {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        Scheduler scheduler = Schedulers.from(executorService);

        Observable<String> source = Observable.just("Pasta", "Pizza","Fries","Curry","Chow mein")
                .subscribeOn(scheduler)
                .doFinally(executorService::shutdown);

        System.out.println("CustomSchedulers");

        source.subscribe(e  -> ioOperation("1- "+e));
        source.subscribe(e  -> ioOperation("2- "+e));
        source.subscribe(e  -> ioOperation("3- "+e));
        source.subscribe(e  -> ioOperation("4- "+e));
        source.subscribe(e  -> ioOperation("5- "+e));

        executorService.shutdown();
    }

    private static void ioOperation(Object e) throws InterruptedException {

        Thread.sleep(1000);
        System.out.println(e+", newThread Done By "+Thread.currentThread().getName());
    }
}
