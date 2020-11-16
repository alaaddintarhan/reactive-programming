package com.attin.reactive.RxJava.rx12FlowableAndBackPressure;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class BackPressure {

    public static void main(String[] args) throws InterruptedException {

        Observable.range(0, 1000000)
                .map(e -> {
                    //runs on main Thread
                    System.out.println("Produced item is " + e + " :" + Thread.currentThread().getName());
                    return e;
                })
                .observeOn(Schedulers.io())
                .subscribe(e -> {
                    // runs on new Thread
                    sleep(10);
                    System.out.println("Consumed item is  " + e + " :" + Thread.currentThread().getName());
                });

    Thread.sleep(10000000);
    }

    private static void sleep(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
