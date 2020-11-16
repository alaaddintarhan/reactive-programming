package com.attin.reactive.r6FunctionalProgramming.higherOrderFunction;

public class HigherOrderFunctions {


    public static void main(String[] args) {

        IFactory<Integer> factory = createFactory(() -> Math.random()*1000, val -> val.intValue());
        Integer factoryVal = factory.create();
        System.out.println(factoryVal);
    }

    public static <T, R> IFactory<R> createFactory(IProducer<T> producer, IConfigurator<T, R> configurator) {

        return () -> {
            T product = producer.produce();
            return configurator.configure(product);
        };
    }
}
