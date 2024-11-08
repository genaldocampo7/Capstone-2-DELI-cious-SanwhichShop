package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {

        HomeMenu();
    }

    public static void HomeMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Welcome to DELI-cious Sandwich shop!");
        scanner.nextLine();
        System.out.println("What would you like to do?: \n " +
                "1) New Order \n " +
                "0) Exit");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                OrderMenu();
                break;
            case 0:
                System.out.println("Exiting...");
                scanner.nextLine();
                System.out.println("Thank you, have a nice day!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                scanner.nextLine();
                scanner.nextLine();
                HomeMenu();
        }
    }

    public static void OrderMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to order?:\n" +
                "1) Add sandwich \n" +
                "2) Add drink \n" +
                "3) Add chips \n" +
                "4) Checkout \n" +
                "0) Cancel order");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                SandwichMenu();
                break;
            case 2:
                DrinkMenu();
                break;
            case 3:
                ChipsMenu();
                break;
            case 4:
                CheckoutScreen.CheckoutMenu();
                break;
            case 0:
                System.out.println("Going back to HomeScreen...");
                scanner.nextLine();
                scanner.nextLine();
                UserInterface.HomeMenu();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                scanner.nextLine();
                OrderMenu();
        }
    }

    public static void SandwichMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your bread: \n" +
                "White, Wheat, Rye, Wrap");

        String breadChoice = scanner.nextLine();

        switch (breadChoice) {
            case "White":
            case "white":
                System.out.println(breadChoice);
                break;
            case "Wheat":
            case "wheat":
                System.out.println(breadChoice);
                break;
            case "Rye":
            case "rye":
                System.out.println(breadChoice);
                break;
            case "Wrap":
            case "wrap":
                System.out.println(breadChoice);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                SandwichMenu();
        }

        System.out.println("Select your size (Enter number): \n" +
                "4\" - $5.50, 8\" - $7.00, 12\" - $8.50");

        int breadSize = scanner.nextInt();

        switch (breadSize) {
            case 4:
                break;
            case 8:
                break;
            case 12:
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                SandwichMenu();
        }

        System.out.println("Select meat of choice:\n " +
                "Steak, Ham, Salami, Roast beef, Chicken, Bacon");
        String meatChoice = scanner.nextLine();
        System.out.println(meatChoice);
        scanner.nextLine();


        System.out.println("Would you like to add extra meat? (Yes/No)");
        String extraMeatOption = scanner.nextLine();

        if (extraMeatOption.equalsIgnoreCase("Yes")) {
            System.out.println("Select extra meat: \n" +
                    "Steak, Ham, Salami, Roast beef, Chicken, Bacon");
            String extraMeatChoice = scanner.nextLine();
            System.out.println("added extra: " + extraMeatChoice);
        } else if (extraMeatOption.equalsIgnoreCase("No")) {

        }


        System.out.println("Select cheese of choice: \n" +
                "American, Provolone, Cheddar, Swiss");

        String cheeseChoice = scanner.nextLine();
        System.out.println(cheeseChoice);

        System.out.println("Would you like to add extra cheese? (Yes/No)");
        String extraCheeseOption = scanner.nextLine();

        if (extraCheeseOption.equalsIgnoreCase("Yes")) {
            System.out.println("Select cheese of choice: \n" +
                    "American, Provolone, Cheddar, Swiss");
            String extraCheese = scanner.nextLine();
            System.out.println("added extra: " + " " + extraCheese);
        } else if (extraCheeseOption.equalsIgnoreCase("No")) {

        }

        System.out.println("Choose topping of choice (Select multiple if necessary): \n" +
                "lettuce, peppers, onions, tomatoes, jalapenos, cucumbers, pickles, guacamole, mushrooms");
        String toppingChoice = scanner.nextLine();
        System.out.println("Added: " + " " + toppingChoice);

        System.out.println("Select sauce of choice: \n" +
                "Mayo, Mustard, Ketchup, Ranch, Thousand islands, Vinaigrette");
        String sauceChoice = scanner.nextLine();
        System.out.println("Added: " + " " + sauceChoice);

        System.out.println("Would you like your sandwich toasted? (Yes/No)");
        String toastedOption = scanner.nextLine();
        if (toastedOption.equalsIgnoreCase("Yes")) {
            System.out.println("Added: toasted option");
        } else if (toastedOption.equalsIgnoreCase("No")) {

        }
    }


    public static void DrinkMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your drink: \n" +
                "Coke, Sprite, Fanta(Orange), Mountain Dew, Dr. Pepper, Root beer, Brisk (Iced tea), Minute Maid (Lemonade) ");
        String drinkChoice = scanner.nextLine();
        System.out.println(drinkChoice);
        System.out.println("Select drink size: \n" +
                "small - $2.00, Medium - $2.50, Large - $3.00");
        String drinkSize = scanner.nextLine();

        switch (drinkSize) {
            case "Small":
            case "small":
                System.out.println(drinkChoice + ", " + drinkSize);
                break;
            case "M":
            case "m":
                System.out.println(drinkChoice + ", " + drinkSize);
                break;
            case "L":
            case "l":
                System.out.println(drinkChoice + ", " + drinkSize);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                DrinkMenu();

        }
    }

        public static void ChipsMenu() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select Chips: \n " +
                    "Doritos (Nacho cheese), Doritos (Cool ranch), Lays (Original), Lays (Sour cream), Lays (Barbeque), Cheetos");
            String chipsChoice = scanner.nextLine();
            System.out.println(chipsChoice);





        }




    }


