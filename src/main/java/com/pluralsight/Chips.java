package com.pluralsight;

public class Chips implements Orderable {
    private String chipsName;

    public Chips(String chipsName) {
        this.chipsName = chipsName;
    }

    public String getChipsName() {
        return chipsName;
    }

    public void setChipsName(String chipsName) {
        this.chipsName = chipsName;
    }

    @Override
    public double getPrice() {
        return 1.50;
    }

    @Override
    public void addMessage() {
        System.out.println("Added: " + chipsName);
    }



}
