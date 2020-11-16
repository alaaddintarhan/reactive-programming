package com.attin.reactive.RxJava.rx05CombiningObservables;

import com.attin.reactive.RxJava.rx04Operators.Employee;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class Merge {

    public static void main(String[] args) throws InterruptedException {

        /**
         * Observable.merge
         */
        System.out.println("********************** merge for observers in same thread************");
        Observable<Employee> source1 = Observable.just(
                new Employee(101, "Alexa", 6000, 4.0),
                new Employee(102, "Dhwanit", 5600, 1.5));
        Observable<Employee> source2 = Observable.just(
                new Employee(103, "Ella", 9500, 8.0),
                new Employee(104, "Max", 6500, 1.5));

        //these are running  sequentially because of these observers are  in same thread
        Observable.merge(source1, source2).subscribe(x -> System.out.println(x.getId()));

        System.out.println("********************** merge Concurrent Program ************");
        Observable<String> source3 = Observable.interval(1, TimeUnit.SECONDS).map(e -> "src3 : " + e);
        Observable<String> source4 = Observable.interval(1, TimeUnit.SECONDS).map(e -> "src4 : " + e);

        Observable.merge(source3, source4)
                .subscribe(System.out::println);

        Thread.sleep(5000);

        /**
         * Observable.concat
         */
        System.out.println("********************** concat ************");

        Observable<String> source5 = Observable.interval(1, TimeUnit.SECONDS).map(e -> "src5 : " + e);
        Observable<String> source6 = Observable.interval(1, TimeUnit.SECONDS).map(e -> "src6 : " + e);

        Observable.concat(source3, source4)
                .subscribe(System.out::println);

        Thread.sleep(5000);
    }
}
