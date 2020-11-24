package com.attin.reactive.r10RxJava.rx04Operators;

import io.reactivex.Observable;

import java.util.List;

public class OperatorsInAction {

    public static void main(String[] args) {

        Observable<Employee> obs = Observable.just(new Employee(101, "Alexa", 6000, 4.0),
                new Employee(102, "Dhwanit", 5600, 1.5),
                new Employee(103, "Mike", 5350, 9.0),
                new Employee(104, "Ella", 9500, 8.0),
                new Employee(104, "Max", 6500, 1.5),
                new Employee(104, "Jhonny", 1500, 11.0),
                new Employee(104, "Jim", 740, 0.5),
                new Employee(104, "Jho", 5698, 2.7),
                new Employee(105, "Lucy", 8400, 7.5));

        obs.filter(employee -> employee.getRaiting() > 4)
                .sorted((o1, o2) -> Double.compare(o1.getRaiting(), o2.getRaiting()))
                .map(e -> e.getName())
                .take(4)
                .toList()
                .subscribe(System.out::println);

        //scan
        List<Integer> expenses = List.of(125, 659, 78, 9, 31, 564, 897, 6, 4, 12, 654, 657, 8);
        Observable.fromIterable(expenses)
                .scan((e1, e2) -> e1 + e2)
                .toList()
                .subscribe(System.out::println);

        //reduce
        Observable.fromIterable(expenses)
                .reduce((e1, e2) -> e1 + e2)
                .subscribe(System.out::println);
    }
}
