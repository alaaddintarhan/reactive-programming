package com.attin.reactive.r5FunctionalProgramming.higherOrderFunction;

public interface IConfigurator<T, R> {

    R configure(T t);
}
