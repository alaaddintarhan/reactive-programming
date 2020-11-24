package com.attin.reactive.r10RxJava.rx10SubjectReplayingCaching.subjectTypes;

import io.reactivex.subjects.ReplaySubject;
import io.reactivex.subjects.Subject;

public class s2ReplayingSubject {

    public static void main(String[] args) throws InterruptedException {

        Subject<Object> subject =  ReplaySubject.create();

        //first subscriber
        subject.subscribe(s->System.out.println("Subscriber-1 : "+s));

        subject.onNext("a");
        subject.onNext("b");
        subject.onNext("c");

        //second observer
        subject.subscribe(s->System.out.println("Subscriber-2 : "+s));

        subject.onNext("d");
        subject.onNext("e");
    }
}
