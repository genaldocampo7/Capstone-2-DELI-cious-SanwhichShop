package com.pluralsight;
import java.util.List;

public class Toppings {
    public static List<String> toppings = List.of("lettuce", "peppers", "onions", "tomatoes", "jalapenos", "pickles", "guacamole", "mushrooms");

    public Toppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public void addMessage() {
        System.out.println("Toppings: " + String.join(", ", toppings));
    }

    public List<String> getToppings() {
        return toppings;
    }
}

