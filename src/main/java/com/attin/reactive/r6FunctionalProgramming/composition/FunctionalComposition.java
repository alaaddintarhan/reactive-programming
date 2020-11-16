package com.attin.reactive.r6FunctionalProgramming.composition;


public class FunctionalComposition {

    public static void main(String[] args) {

        //Function<T,R>
        Function<Square,Integer> areaFunction = square -> square.getArea();
        //Function<R,V>
        Function<Integer,Double> squareFunction = area -> Math.sqrt(area);

        //Function<T,V>
        Function<Square, Double> compose = squareFunction.compose(areaFunction);

        Square square=new Square(5);
        System.out.println(compose.apply(square));
    }
}
