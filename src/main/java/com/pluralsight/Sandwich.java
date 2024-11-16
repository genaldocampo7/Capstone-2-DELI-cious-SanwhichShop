package com.pluralsight;

public class Sandwich implements Orderable {
    private String breadType;
    private String breadSize;
    private String meat;
    private boolean extraMeat;
    private String cheese;
    private boolean extraCheese;
    private Toppings toppings;
    private String sauce;
    private String side;
    private boolean toasted;
    private double price;

    public Sandwich(String breadType, String breadSize, String meat, boolean extraMeat, String cheese, boolean extraCheese,
                    Toppings toppings, String sauce, String side, boolean toasted) {
        this.breadType = breadType;
        this.breadSize = breadSize;
        this.meat = meat;
        this.extraMeat = extraMeat;
        this.cheese = cheese;
        this.extraCheese = extraCheese;
        this.toppings = toppings;
        this.sauce = sauce;
        this.side = side;
        this.toasted = toasted;
        this.price = calculatePrice();
    }

    private double calculatePrice() {
        double price = 0.0;
        switch (breadSize) {
            case "4\"":
                price += 5.50;
                break;
            case "8\"":
                price += 7.00;
                break;
            case "12\"":
                price += 8.50;
                break;
        }

        // Calculate meat price depending on bread size

        switch (breadSize) {
            case "4\"":
                price += 1.00;
                break;
            case "8\"":
                price += 2.00;
                break;
            case "12\"":
                price += 3.00;
                break;
        }

        // Calculate extra meat price depending on bread size
        if (extraMeat) {
            switch (breadSize) {
                case "4\"":
                    price += 0.50;
                    break;
                case "8\"":
                    price += 1.00;
                    break;
                case "12\"":
                    price += 1.50;
                    break;
            }
        }

        // Calculate cheese price depending on bread size
        switch (breadSize) {
            case "4\"":
                price += 0.75;
                break;
            case "8\"":
                price += 1.50;
                break;
            case "12\"":
                price += 1.75;
                break;
        }

        // Calculate extra cheese price depending on bread size
        if (extraCheese) {
            switch (breadSize) {
                case "4\"":
                    price += 0.30;
                    break;
                case "8\"":
                    price += 0.60;
                    break;
                case "12\"":
                    price += 0.90;
                    break;
            }
        }

        return price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void addMessage() {
        System.out.println("Sandwich: " + breadType + " " + breadSize + " " + "Toasted: " + (toasted ? "(Yes)" : "(No)") + ", " +
        getToppings());
        System.out.println("Meat: " + meat + (extraMeat ? " (extra)" : ""));
        System.out.println("Cheese: " + cheese + (extraCheese ? " (extra)" : ""));
        System.out.println("Sauce: " + sauce);
        System.out.println("Side: " + side);
        System.out.println("Price: $" + price);
    }

    public Toppings getToppings() {
        return toppings;
    }

    public void setToppings(Toppings toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Sandwich: "  + breadType + " " + breadSize + " " + "Toasted: " + (toasted ? "(Yes)" : "(No)") + ", " +
                getToppings() + "\n" +
                "Meat: " + meat + (extraMeat ? " (extra)" : "") + "\n" +
                "Cheese: " + cheese + (extraCheese ? " (extra)" : "") + "\n" +
                "Sauce: " + sauce + "\n" +
                "Side: " + side + "\n" +
                "Price: $" + price + " \n";
    }
}










