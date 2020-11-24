package com.attin.reactive.r6DesingPatterns.behavioral.strategy;

public class StrategyDesignPattern {

    public static void main(String[] args) {

        FileContext fileContext = new FileContext();
        fileContext.setCompressionStrategy(new CompressToRar());

        fileContext.generateFile("README.txt");
    }
}
