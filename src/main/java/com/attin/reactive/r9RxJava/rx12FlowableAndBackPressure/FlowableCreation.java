package com.attin.reactive.r9RxJava.rx12FlowableAndBackPressure;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.schedulers.Schedulers;

public class FlowableCreation {

    public static void main(String[] args) throws InterruptedException {

        Flowable.create(emitter -> {
            for (int i = 0; i <= 5000; i++) {
                    if (emitter.isCancelled())
                        return;
                    emitter.onNext(i);
            }
        }, BackpressureStrategy.BUFFER)
        .observeOn(Schedulers.io())
        .subscribe(System.out::println);

        Thread.sleep(10000);
    }


}
