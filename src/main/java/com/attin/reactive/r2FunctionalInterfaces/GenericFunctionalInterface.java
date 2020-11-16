package com.attin.reactive.r2FunctionalInterfaces;

@FunctionalInterface
public interface GenericFunctionalInterface<T, R> {

    //  a functional interface has EXACTLY one abstract method.

    R execute(T t);

}
