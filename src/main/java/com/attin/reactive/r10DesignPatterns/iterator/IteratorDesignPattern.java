package com.attin.reactive.r10DesignPatterns.iterator;

import java.util.*;

public class IteratorDesignPattern {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("John");
        list.add("Rohn");
        list.add("Shiva");

        Iterator<String> it = list.iterator();
        System.out.println("Concrete Iterator we get  get is "+it.toString());


        Set<String> set = new HashSet<>();
        set.add("Tom");
        set.add("John");
        set.add("Rohn");

        Iterator<String> setItr = set.iterator();
        System.out.println("Concrete Iterator we get  get is "+setItr.toString());
    }
}
