package com.pluralsight;

public class AddDrink implements Orderable {
    private String drinkSize;
    private String drinkName;

    @Override
    public double getPrice() {
        if (drinkSize.equalsIgnoreCase("small")) {
            return 2.00;
        } else if (drinkSize.equalsIgnoreCase("medium")) {
            return 2.50;
        } else if (drinkSize.equalsIgnoreCase("large")) {
            return 3.00;
        }
        return 0;
    }

    public String toString() {
        return "Added: " + drinkName + ", " + drinkSize;
    }

}






