package com.attin.reactive.r10RxJava.rx12FlowableAndBackPressure;

import io.reactivex.Flowable;
import io.reactivex.schedulers.Schedulers;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.concurrent.atomic.AtomicInteger;

public class FlowableSubscriber {

    public static void main(String[] args) throws InterruptedException {

        Flowable.range(0, 1000000)
                .map(e -> {
                    System.out.println("Produced item is " + e + " :" + Thread.currentThread().getName());
                    return e;
                })
                .observeOn(Schedulers.io())
                .subscribe(new Subscriber<Integer>() {

                               Subscription s;
                               AtomicInteger count = new AtomicInteger(0);

                               @Override
                               public void onSubscribe(Subscription subscription) {
                                   this.s = subscription;
                                   System.out.println("Asking for 20 items");
                                   s.request(20);
                               }

                               @Override
                               public void onNext(Integer item) {
                                   System.out.println("The subscriber consumed : " + item);
                                   if (count.getAndIncrement() % 20 == 0) {
                                       System.out.println("Asking for 20 items.");
                                       s.request(30);
                                   }

                                   try {
                                       Thread.sleep(100);
                                   } catch (InterruptedException e) {
                                       e.printStackTrace();
                                   }
                               }

                               @Override
                               public void onError(Throwable throwable) {
                                   throwable.printStackTrace();
                               }

                               @Override
                               public void onComplete() {
                                   System.out.println("completed.");
                               }
                           }
                );

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
