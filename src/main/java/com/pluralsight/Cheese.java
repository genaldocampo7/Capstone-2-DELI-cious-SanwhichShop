package com.pluralsight;
import java.util.List;

public class Cheese {
   private List<String> Cheese = List.of("american", "provolone", "cheddar", "swiss");
   private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getCheese() {
        return Cheese;
    }

    public void setCheese(List<String> cheese) {
        Cheese = cheese;
    }
}

