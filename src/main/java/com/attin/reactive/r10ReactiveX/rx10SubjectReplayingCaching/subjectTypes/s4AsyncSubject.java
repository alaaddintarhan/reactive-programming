package com.attin.reactive.r10ReactiveX.rx10SubjectReplayingCaching.subjectTypes;

import io.reactivex.subjects.AsyncSubject;
import io.reactivex.subjects.Subject;

public class s4AsyncSubject {

    public static void main(String[] args) throws InterruptedException {

        Subject<Object> subject = AsyncSubject.create();

        //first subscriber
        subject.subscribe(s->System.out.println("Subscriber-1 : "+s));
        subject.onNext("a");
        subject.onNext("b");

        //second subscriber
        subject.subscribe(s->System.out.println("Subscriber-2 : "+s));
        subject.onNext("c");
        subject.onNext("d");

        //third subscriber
        subject.subscribe(s->System.out.println("Subscriber-3 : "+s));
        subject.onNext("e");
        subject.onNext("f");

        //emits just last item of the subject to all subscribers after invoked onComplete
        subject.onComplete();

    }
}
