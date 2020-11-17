package com.attin.reactive.r9RxJava.rx10SubjectReplayingCaching.subjectTypes;

import io.reactivex.Observable;
import io.reactivex.subjects.Subject;
import io.reactivex.subjects.UnicastSubject;

import java.util.concurrent.TimeUnit;

public class s5UnicastSubject {

    public static void main(String[] args) throws InterruptedException {

        Subject<Long> subject = UnicastSubject.create();

        Observable.interval(500, TimeUnit.MILLISECONDS)
                .subscribe(subject);

        System.out.println("main thread is sleeping for 2 minutes.");
        /*
         * unicastSubject  buffers all items of the before subscriber for during 2 minutes
         * and it emits all items in the buffer to subscriber when one is  subscribed
         */
        Thread.sleep(2000);

        subject.subscribe(s-> System.out.println("Subscriber : "+s));

        /*
         * java.lang.IllegalStateException: Only a single observer allowed.
         */
        //subject.subscribe(s-> System.out.println("Subscriber-2 : "+s));
    }
}
