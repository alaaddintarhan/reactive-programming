package com.attin.reactive.RxJava.rx10SubjectReplayingCaching.subjectTypes;

import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.Subject;

public class s3BehaviorSubject {

    public static void main(String[] args) throws InterruptedException {

        Subject<Object> subject = BehaviorSubject.create();

        //first subscriber
        subject.subscribe(s->System.out.println("Subscriber-1 : "+s));

        subject.onNext("a");
        subject.onNext("b");
        subject.onNext("c");

        //second subscriber
        subject.subscribe(s->System.out.println("Subscriber-2 : "+s));

        subject.onNext("d");
        subject.onNext("e");
    }
}
