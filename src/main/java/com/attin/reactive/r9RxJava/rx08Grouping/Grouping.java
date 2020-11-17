package com.attin.reactive.r9RxJava.rx08Grouping;

import com.attin.reactive.r9RxJava.rx04Operators.Employee;

import io.reactivex.Observable;

public class Grouping {

    public static void main(String[] args) throws InterruptedException {


        Observable<Employee> obs = Observable.just(new Employee(101, "Alexa", 6000, 4.0),
                new Employee(102, "Dhwanit", 5600, 6.5),
                new Employee(103, "Mike", 5350, 4.0),
                new Employee(104, "Ella", 9500, 4.0),
                new Employee(104, "Max", 6500, 6.5),
                new Employee(104, "Jhonny", 1500, 6.5),
                new Employee(104, "Jim", 740, 1.5),
                new Employee(104, "Jho", 5698, 1.5),
                new Employee(105, "Lucy", 8400, 6.5));

        obs.groupBy(e-> e.getRaiting())
                .flatMapSingle(grp -> grp.toMultimap( key -> grp.getKey(), employee -> employee.getName()))
                .subscribe(System.out::println);
    }
}
