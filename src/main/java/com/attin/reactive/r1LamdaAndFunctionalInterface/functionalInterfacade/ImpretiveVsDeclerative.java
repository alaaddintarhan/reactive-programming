package com.attin.reactive.r1LamdaAndFunctionalInterface.functionalInterfacade;

import java.util.stream.IntStream;

public class ImpretiveVsDeclerative {

    public static void main(String[] args) {

        //Impretive --> how to do
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.printf("\n>> Impretive << Sum : %s",sum);

        //Declerative or Functional -->  what to do
        sum =  IntStream.rangeClosed(0,100).filter(c->c%2==0).sum();

        System.out.printf("\n>> Declerative << Sum : %s",sum);

    }

}
