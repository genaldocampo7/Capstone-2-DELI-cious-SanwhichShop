package com.pluralsight;
import java.util.ArrayList;
import java.util.List;

public class Toppings {
    public static List<String> toppings = List.of("lettuce", "peppers", "onions", "tomatoes", "jalapenos", "pickles", "guacamole", "mushrooms");

    private List<String> topping = new ArrayList<>();

    public Toppings(List<String> toppings) {
        this.topping = toppings;
    }


    public List<String> getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return "Toppings: " + topping;
    }
}



