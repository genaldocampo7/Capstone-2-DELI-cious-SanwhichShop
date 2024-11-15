package com.pluralsight;
import java.util.List;

public class Meat {
    private List<String> Meat = List.of("steak", "ham", "salami", "roast beef", "chicken", "bacon");
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getMeat() {
        return Meat;
    }

    public void setMeat(List<String> meat) {
        Meat = meat;
    }
}



