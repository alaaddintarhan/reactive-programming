package com.attin.reactive.r6FunctionalProgramming.composition;

@FunctionalInterface
public interface Function<T, R> {

    R apply(T t);


    default <V> Function<V, R> compose(Function<V, T> before) {
        /**
         * Function<V,T> before.apply(v) --> returns  T
         * this.apply(T t) --> returns R
         */
        return v -> this.apply(before.apply(v));
    }
}
