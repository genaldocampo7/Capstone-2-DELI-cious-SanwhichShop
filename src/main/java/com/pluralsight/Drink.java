package com.pluralsight;

public class Drink implements Orderable {
    private String drinkSize;
    private String drinkType;


    public Drink(String drinkSize, String drinkType) {
        this.drinkSize = drinkSize;
        this.drinkType = drinkType;
    }

    public String getDrinkSize() {
        return drinkSize;
    }

    public void setDrinkSize(String drinkSize) {
        this.drinkSize = drinkSize;
    }

    public String getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }

    @Override
    public double getPrice() {
         if (drinkSize.equalsIgnoreCase("small")) {
             return 2.00;
         } else if (drinkSize.equalsIgnoreCase("Medium")) {
             return 2.50;
         } else if (drinkSize.equalsIgnoreCase("Large")) {
             return 3.00;
         } else return 0.0;
    }

    @Override
    public void addMessage() {
        System.out.println("Added: " + drinkType + ", " + drinkSize);
    }

    @Override
    public String toString() {
        return "Drink: " + drinkType + ", " + drinkSize + "\n";
    }
}






