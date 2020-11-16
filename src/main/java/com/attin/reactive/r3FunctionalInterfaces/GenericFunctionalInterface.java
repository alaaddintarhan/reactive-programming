package com.attin.reactive.r3FunctionalInterfaces;

@FunctionalInterface
public interface GenericFunctionalInterface<T, R> {

    //  a functional interface has EXACTLY one abstract method.

    R execute(T t);

}
