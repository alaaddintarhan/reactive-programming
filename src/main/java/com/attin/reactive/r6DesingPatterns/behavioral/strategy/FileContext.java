package com.attin.reactive.r6DesingPatterns.behavioral.strategy;

import com.attin.reactive.r10DesignPatterns.behavioral.strategy.Strategy;

public class FileContext {

    com.attin.reactive.r10DesignPatterns.behavioral.strategy.Strategy strategy;

    public void setCompressionStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void  generateFile(String fileName){
        strategy.compressFile(fileName);
    }

}
