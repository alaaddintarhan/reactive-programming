package com.attin.reactive.r6DesingPatterns.behavioral.strategy;

import com.attin.reactive.r10DesignPatterns.behavioral.strategy.CompressToRar;
import com.attin.reactive.r10DesignPatterns.behavioral.strategy.FileContext;

public class StrategyDesignPattern {

    public static void main(String[] args) {

        com.attin.reactive.r10DesignPatterns.behavioral.strategy.FileContext fileContext = new FileContext();
        fileContext.setCompressionStrategy(new CompressToRar());

        fileContext.generateFile("README.txt");
    }
}
