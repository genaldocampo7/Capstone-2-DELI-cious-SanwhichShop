package com.pluralsight;

public class AddSandwich  implements Orderable {
    private String bread;
    private int breadSize;
    private String meat;
    private String extraMeat;
    private String cheese;
    private String extraCheese;
    private String toppings;
    private String side;

    @Override
    public double getPrice() {
        double price = 0;
        if (breadSize == 4) {
            price = 5.5;
        } else if (breadSize == 8) {
            price = 7.0;
        } else if (breadSize == 12) {
            price = 8.5;
        }
        return 0;


    }







}
