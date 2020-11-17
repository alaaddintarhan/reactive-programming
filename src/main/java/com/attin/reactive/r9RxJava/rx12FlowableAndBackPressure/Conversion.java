package com.attin.reactive.r9RxJava.rx12FlowableAndBackPressure;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Conversion {

    public static void main(String[] args) throws InterruptedException {

        Observable.range(0,10000)
                .toFlowable(BackpressureStrategy.BUFFER)
                .observeOn(Schedulers.io())
                .subscribe(s-> System.out.printf("\n%s , %s",s,Thread.currentThread().getName()));

        Thread.sleep(5000);

        Flowable.range(0,10000)
                .toObservable()
                .observeOn(Schedulers.io())
                .subscribe(s-> System.out.printf("\n%s , %s",s,Thread.currentThread().getName()));

        Thread.sleep(5000);

    }
}
