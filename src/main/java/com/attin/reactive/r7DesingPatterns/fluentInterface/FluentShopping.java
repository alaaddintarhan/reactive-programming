package com.attin.reactive.r7DesingPatterns.fluentInterface;


import com.attin.reactive.r6FunctionalProgramming.composition.Function;

public class FluentShopping {

    public static void main(String[] args) {

   /*     Order myOrder = new Order().add("Shoes");
        myOrder.add("Headphones");
        myOrder.deliverAt(" Street no 45 , Jodhpur"); */

/*
        Function<Order, Order> orderOrderFunction2 = new Function<Order, Order>() {
            @Override
            public Order apply(Order order) {
                order.add("Shoes");
                order.add("Headphoes");
                order.deliverAt("Street no 45 ,Jodhpur ");

                return order;
            }
        };
*/
        Function<Order, Order> orderOrderFunction = order -> order.add("Shoes").add("Headphoes").deliverAt("Street no 45 ,Jodhpur ");

        Order.place(orderOrderFunction);
    }
}
