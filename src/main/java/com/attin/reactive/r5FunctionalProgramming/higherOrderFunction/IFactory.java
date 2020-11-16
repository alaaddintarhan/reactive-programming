package com.attin.reactive.r5FunctionalProgramming.higherOrderFunction;

@FunctionalInterface
public interface IFactory<T> {

    T create();
}
