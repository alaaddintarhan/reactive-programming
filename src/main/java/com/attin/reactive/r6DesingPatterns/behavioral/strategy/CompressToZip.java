package com.attin.reactive.r6DesingPatterns.behavioral.strategy;

import com.attin.reactive.r10DesignPatterns.behavioral.strategy.Strategy;

public class CompressToZip implements Strategy {

    @Override
    public void compressFile(String fileName) {
        System.out.println(fileName+" has been successfully converted to zip file.");
    }
}
