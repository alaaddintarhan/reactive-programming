package com.attin.reactive.r10ReactiveX.rx07ZipCombineLatest;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class ZipAndCombineLatest {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("***************** zip *************");

        Observable<Long> obs1 = Observable.interval(200, TimeUnit.MILLISECONDS);
        Observable<Long> obs2 = Observable.interval(1, TimeUnit.SECONDS);

        Observable.zip(obs1,obs2,(e1,e2)-> "Source-1: "+e1+" , Source-2:"+e2)
                .subscribe(System.out::println);

        Thread.sleep(10000);

        System.out.println("***************** combineLatest *************");
        Observable.combineLatest(obs1,obs2,(e1,e2)-> "Source-1: "+e1+" , Source-2:"+e2)
                .subscribe(System.out::println);

        Thread.sleep(10000);

    }
}
