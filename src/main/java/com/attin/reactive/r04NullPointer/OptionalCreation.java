package com.attin.reactive.r04NullPointer;

import java.util.Optional;

public class OptionalCreation {

    public static void main(String[] args) {

        /**
         * Optinal<T> immutable
         */
        String val = "A String Value";
        Optional<String> optional = Optional.of(val);
        System.out.println(optional);

        //empty
        Optional<String> empty = Optional.empty();

        //nullable
        Optional<String> nullable = Optional.ofNullable(val);


        Optional<String> emptyOptional = Optional.empty();
        //isPresent
        String str = emptyOptional.isPresent() ? emptyOptional.get() : "default val";
        System.out.println(str);

        //isPresent
        str = emptyOptional.isPresent() ? emptyOptional.get() : "isPresent() default val";
        System.out.println(str);

        //orElse
        str = emptyOptional.orElse("orElse() default value");
        System.out.println(str);

        // orElseGet(Suplier)
        str = emptyOptional.orElseGet(() -> "orElseGet() returned from supplier method");
        System.out.println(str);

        //elseThrow
        try {
            str = emptyOptional.orElseThrow(() -> new Exception(" the value has not to  null..."));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
