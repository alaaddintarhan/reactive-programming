package com.attin.reactive.RxJava.rx01;

import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;

public class rx07Variants {

    public static void main(String[] args) {

        Observable source = Observable.just("Attin", "Emel", "Tarhan");
        source.first("Alaaddin").subscribe(System.out::println);

        Observable source1 = Observable.empty();
        source1.first("Alaaddin").subscribe(System.out::println);

        Single.just("Single Alex").subscribe(System.out::println);

        Consumer<Throwable> onError = throwable -> throwable.printStackTrace();
        //firstElement returns 0 or 1 . because of that it doest not throw exception
        source1.firstElement().subscribe(System.out::println, onError,() -> System.out.println("Completed..!"));

        Completable completable = Completable.complete();
        System.out.println();

        completable.subscribe(() -> System.out.println("..Completed.."));
        Completable
                .fromRunnable(() -> System.out.println("Some process executing..."))
                .subscribe(() -> System.out.println("The process is executed succesfuly..."));


    }
}
