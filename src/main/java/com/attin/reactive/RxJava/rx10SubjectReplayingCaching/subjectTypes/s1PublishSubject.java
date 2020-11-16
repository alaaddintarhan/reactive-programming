package com.attin.reactive.RxJava.rx10SubjectReplayingCaching.subjectTypes;

import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;

public class s1PublishSubject {

    public static void main(String[] args) throws InterruptedException {

        Subject<Object> subject = PublishSubject.create();

        subject.subscribe(System.out::println);

        subject.onNext("a");
        subject.onNext("b");
        subject.onNext("c");

        subject.subscribe(System.out::println);

        subject.onNext("d");
        subject.onNext("e");
    }
}
