package com.attin.reactive.r9RxJava.rx01;

import io.reactivex.Observable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class rx03CreatingObservable {

    public static void main(String[] args) {

        //create
        Observable<Integer> source = Observable.create(e -> {
            e.onNext(10);
            e.onNext(11);
            e.onComplete();
        });

        source.subscribe(System.out::println);

        //just()
        Observable<Integer> sourceWithJust = Observable.just(1, 2, 3);
        sourceWithJust.subscribe(System.out::println);

        //fromIterable
        List<String> list = List.of("Mike", "Shyam", "Ram");
        Observable<String> sourceWithIterable = Observable.fromIterable(list);
        sourceWithIterable.subscribe(System.out::println);

        //range
        Observable.range(3, 4).subscribe(s -> System.out.printf("\nRECEIVED : %s", s));

        //interval
        Observable.interval(1, TimeUnit.SECONDS);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //from future
        //Observable.fromFuture(future)
        //empty
        Observable.empty();
        //never
        Observable.never();
        //error
        //Observable.error(exception)

        //defer
        List<String> itList = new ArrayList();
        itList.add("Ram");
        itList.add("Mike");

        Observable<String> deferSource = Observable.defer(() -> Observable.fromIterable(itList));
        deferSource.subscribe(System.out::println);

        itList.add("Paul");
        source.subscribe(System.out::println);

    }
}
