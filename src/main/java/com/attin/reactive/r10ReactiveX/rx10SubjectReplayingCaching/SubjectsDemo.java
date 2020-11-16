package com.attin.reactive.r10ReactiveX.rx10SubjectReplayingCaching;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;

public class SubjectsDemo {

    public static void main(String[] args) throws InterruptedException {

        Subject<Object> subject = PublishSubject.create();
        Subject<Object> serialized = subject.toSerialized();

        serialized.subscribe(System.out::println);
        serialized.subscribe(e-> System.out.println("Observer : "+e));

        serialized.onNext("Hello");
        serialized.onNext("BasicStrong");

        serialized.onComplete();
        serialized.onNext("this item does not observe because it is after onComplete method...");
    }
}
