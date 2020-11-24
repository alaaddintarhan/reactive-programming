package com.attin.reactive.r10RxJava.rx04Operators;

import io.reactivex.Observable;

public class rx01Operators {

    public static void main(String[] args) {

        Observable.just(5, 6, 78, 7, 4, 2, 4, 58)
                  .filter(r -> r> 7)
                  .sorted()
                  .subscribe(r -> System.out.println(r));

    }
}
