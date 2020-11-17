package com.attin.reactive.r9RxJava.rx01;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.operators.observable.ObservableCreate;

public class rx02ObservableAndObserver {

    public static void main(String[] args) {

        Observable<Integer> source = new ObservableCreate<Integer>(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> emitter) {

                try {
                    emitter.onNext(10);
                    emitter.onNext(11);

                    emitter.onComplete();

                    //this line wont work because of the onComplete above
                    emitter.onNext(12);
                } catch (Throwable t) {
                    emitter.onError(t);
                }
            }
        });

        Observer<Integer> observer = new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable disposable) {
                System.out.println("Subscribed..!");
            }

            @Override
            public void onNext(Integer integer) {
                System.out.println("onNext : " + integer);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("onError : " + throwable);
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete ");
            }
        };

        source.subscribe(observer);
    }
}
