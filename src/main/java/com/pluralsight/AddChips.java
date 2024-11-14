package com.pluralsight;

public class AddChips implements Orderable {
    private String chipsName;

    @Override
    public double getPrice() {
        return 1.50;
    }

    public String toString() {
        return "Added: " + chipsName;
    }



}
