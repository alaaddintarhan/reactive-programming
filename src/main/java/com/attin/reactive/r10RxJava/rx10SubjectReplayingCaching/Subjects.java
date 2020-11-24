package com.attin.reactive.r10RxJava.rx10SubjectReplayingCaching;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;

public class Subjects {

    public static void main(String[] args) throws InterruptedException {

        Observable src1 = Observable.just(1,2,3,4,5).subscribeOn(Schedulers.computation());
        Observable src2 = Observable.just(10,20,30,40,50).subscribeOn(Schedulers.computation());

        Subject<Object> subject = PublishSubject.create();
        subject.subscribe(s-> System.out.printf("1.Observer :  %s  , %s \n",s,Thread.currentThread().getName()));
        subject.subscribe(s-> System.out.printf(">> 2.Observer :  %s  , %s \n",s,Thread.currentThread().getName()));

        subject.onNext("Hello");
        subject.onNext("BasicStrong");


        src1.subscribe(subject);
       // src2.subscribe(subject);

        Thread.sleep(5000);
    }
}
