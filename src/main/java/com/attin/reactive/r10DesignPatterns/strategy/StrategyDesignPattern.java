package com.attin.reactive.r10DesignPatterns.strategy;

public class StrategyDesignPattern {

    public static void main(String[] args) {

        FileContext fileContext = new FileContext();
        fileContext.setCompressionStrategy(new CompressToRar());

        fileContext.generateFile("README.txt");
    }
}
