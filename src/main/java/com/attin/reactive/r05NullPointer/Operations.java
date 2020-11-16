package com.attin.reactive.r05NullPointer;

import java.util.Optional;

public class Operations {

    public static void main(String[] args) {

        Optional<String> optnl = Optional.empty();
        String orElse = optnl.map(val -> "Replaced").orElse("Empty");
        System.out.println(orElse);

        optnl = Optional.of("EdUcAtIvE");
        Optional<String> strOpt = optnl.filter(val -> val.equalsIgnoreCase("educative"));
        System.out.println(strOpt.get());

        //flatMap
        Optional<String> flatMap = optnl.flatMap(val -> Optional.of("Replaced By FlatMap"));
        System.out.println(flatMap.get());

        //ifPresent
        Optional<String> optional = Optional.of(" Value");
        optional.ifPresent(val -> {
            System.out.println("This is a " + val);
        });

        // ifPresentOrElse
        optional.ifPresentOrElse(val -> {
            System.out.println("This is a " + val);
        }, () -> System.out.println("Value is absent..."));

        //stream
        optional = Optional.of("Stream");
        Optional.empty().stream().forEach(System.out::println);

        //or
        optional.or(() ->  Optional.of("it does not get here if optional is not empty")).ifPresent(System.out::println);
        Optional.empty().or(() -> Optional.of("Optional.or value")).ifPresent(System.out::println);
//        Optional.empty().or(() -> null).ifPresent(System.out::println); --> NPE

        //equals
        System.out.println(optional.equals(Optional.of("Stream")));

        //hashcode
        System.out.printf("HashCode for  Empty Optional : %d ",Optional.empty().hashCode());
        System.out.printf("\nHashCode : %d ",optional.hashCode());
    }
}
