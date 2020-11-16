package com.attin.reactive.r5FunctionalProgramming.chaining;

import java.util.Objects;

@FunctionalInterface
public interface Consumer<T> {

    void accept(T t);

    default Consumer<T> thenAccept(Consumer<T> next) {

        //it throws NullPointerException();
        Objects.requireNonNull(next);

        return t -> {
            this.accept(t);
            next.accept(t);
        };
    }
}
