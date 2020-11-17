package com.attin.reactive.r9RxJava.rx01;

import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

import java.util.concurrent.TimeUnit;

public class rx08Disposing {

    private static CompositeDisposable compDis = new CompositeDisposable();

    public static void main(String[] args) throws InterruptedException {

        Observable<Long> src = Observable.interval(1, TimeUnit.SECONDS);

        Disposable d1 = src.subscribe(e -> System.out.println("Observer-1 : " + e));
        Thread.sleep(2000);
        Disposable d2 = src.subscribe(e -> System.out.println("Observer-2 : " + e));
        Thread.sleep(3000);

        d1.dispose();
        d2.dispose();

        System.out.println("******************************");

        Disposable d3 = src.subscribe(e -> System.out.println("Observer-3 : " + e));
        Disposable d4 = src.subscribe(e -> System.out.println("Observer-4 : " + e));

        compDis.addAll(d3,d4);
        Thread.sleep(3000);
        compDis.dispose();

    }
}
