package com.attin.reactive.r6FunctionalProgramming;

import com.attin.reactive.r6FunctionalProgramming.composition.Function;

public class Currying {

    public static void main(String[] args) {

        //currying technique
        /**
         * Matematik ve bilgisayar biliminde, köri, birden çok argümanı alan bir fonksiyonu, her birinin tek bir argüman alan bir
         * fonksiyonlar dizisine dönüştürme tekniğidir. Örneğin, üç argüman alan bir işlevi körüklemek üç işlev yaratır:
         */

        //  Function<Integer, Integer>  funcInsideFunc= v -> u + v;
        Function<Integer, Function<Integer, Function<Integer, Integer>>> func = u -> v -> z -> u + v + z;

        //  Function<Integer, Integer>  funcInsideFunc= v -> u + v;

        Function<Integer, Function<Integer, Integer>> func1 = func.apply(1);

        Function<Integer, Integer> fuc2 = func1.apply(2); // Function<Integer, Integer> funcInsideFunc= v -> 1 + v;

        Integer r = fuc2.apply(2); // 1+ 2 = 3

        System.out.println(r);

    }
}
