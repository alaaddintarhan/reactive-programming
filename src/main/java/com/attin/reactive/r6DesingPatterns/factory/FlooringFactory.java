package com.attin.reactive.r6DesingPatterns.factory;

import com.attin.reactive.r6DesingPatterns.factory.impl.ConcreteFlooring;
import com.attin.reactive.r6DesingPatterns.factory.impl.CorkFlooring;
import com.attin.reactive.r6DesingPatterns.factory.impl.WoodenFlooring;

import java.util.function.Supplier;

public class FlooringFactory {

    public static Flooring getFlooring(int minTemprature, int maxTemprature) {

        Supplier<Flooring> flooring;

        if(minTemprature <= 5 && maxTemprature <=20) {
            flooring = () -> new WoodenFlooring();
        }else if(minTemprature <=5 && maxTemprature >=45) {
            flooring = () -> new CorkFlooring();
        }else {
            flooring = () -> new ConcreteFlooring();
        }

        return flooring.get();
    }

}
