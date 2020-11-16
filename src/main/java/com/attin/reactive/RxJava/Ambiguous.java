package com.attin.reactive.RxJava;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class Ambiguous {

    public static void main(String[] args) throws InterruptedException {

        Observable<String> obs1 = Observable.interval(1, TimeUnit.SECONDS).take(10).map(t->"** obs1 : "+t);
        Observable<String> obs2 = Observable.interval(10, TimeUnit.MILLISECONDS).take(10).map(t -> "obs2 : "+t);

        Observable.amb(Arrays.asList(obs1,obs2))
                  .subscribe(System.out::println);

        Thread.sleep(2000);
    }
}
