package com.attin.reactive.r6DesingPatterns.behavioral.strategy;

public class FileContext {

    Strategy strategy;

    public void setCompressionStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void  generateFile(String fileName){
        strategy.compressFile(fileName);
    }

}
