package com.attin.reactive.r7DesingPatterns.fluentInterface;

import com.attin.reactive.r6FunctionalProgramming.composition.Function;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<String> cart = new ArrayList<>();
    private String address = "";

    public Order() {

    }

    public Order(List<String> cart, String address) {
        this.cart = cart;
        this.address = address;
    }

    public static void place(Function<Order, Order> function) {
        Order order = new Order();
        order = function.apply(order);
        System.out.println("Order placed");
        System.out.printf("\n%s items ordered by  you will be delivered at '%s' by tommorrow ", order.cart.size(), order.address);
    }

    public Order add(String item) {
        cart.add(item);
        System.out.println(item + " added to the cart");
        return new Order(this.cart, this.address);
    }

    public Order deliverAt(String location) {
        address = location;
        System.out.printf("Delivery address set by you is '%s'\n", location);
        return new Order(this.cart, this.address);
    }
}
