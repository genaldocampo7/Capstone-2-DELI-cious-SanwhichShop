package com.pluralsight;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private static Order currentOrder = new Order();
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
                    Order.checkout();
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
                    "1) White \n" + "2) Wheat \n" + "3) Rye \n" + "4) Wrap");

            int breadChoice = scanner.nextInt();
            String breadType = "";

            switch (breadChoice) {
                case 1:
                    breadType = "White";
                    break;
                case 2:
                    breadType = "Wheat";
                    break;
                case 3:
                    breadType = "Rye";
                    break;
                case 4:
                    breadType = "Wrap";
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    SandwichMenu();
            }

            System.out.println("Select your size: \n" +
                    "1) 4\" - $5.50 \n" + "2) 8\" - $7.00 \n" + "3) 12\" - $8.50");

            int breadSizeChoice = scanner.nextInt();
            String breadSize = "";

            switch (breadSizeChoice) {
                case 1:
                    breadSize = "4\"";
                    break;
                case 2:
                    breadSize = "8\"";
                    break;
                case 3:
                    breadSize = "12\"";
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    SandwichMenu();
            }

            System.out.println("Select meat of choice:\n" +
                    "1) Steak \n" + "2) Ham \n" + "3) Salami \n" + "4) Roast beef \n" + "5) Chicken \n" + "6) Bacon");
            int meatChoice = scanner.nextInt();
            String meat = "";
            switch (meatChoice) {
                case 1:
                    meat = "Steak";
                    break;
                case 2:
                    meat = "Ham";
                    break;
                case 3:
                    meat = "Salami";
                    break;
                case 4:
                    meat = "Roast beef";
                    break;
                case 5:
                    meat = "Chicken";
                    break;
                case 6:
                    meat = "Bacon";
                    break;
            }

            scanner.nextLine();

            System.out.println("Would you like to add extra meat? (Yes/No)");
            boolean extraMeat = scanner.nextLine().equalsIgnoreCase("yes");


            System.out.println("Select cheese of choice: \n" +
                    "1) American \n" + "2) Provolone \n" + "3) Cheddar \n" + "4) Swiss");

            int cheeseChoice = scanner.nextInt();
            String cheese = "";

            switch (cheeseChoice) {
                case 1:
                    cheese = "American";
                    break;
                case 2:
                    cheese = "Provolone";
                    break;
                case 3:
                    cheese = "Cheddar";
                    break;
                case 4:
                    cheese = "Swiss";
                    break;
            }

            scanner.nextLine();

            System.out.println("Would you like to add extra cheese? (Yes/No)");
            boolean extraCheese = scanner.nextLine().equalsIgnoreCase("yes");



            List<String> toppings = new ArrayList<>();
            System.out.println("Choose topping of choice (Select multiple if necessary: \n" +
                    "lettuce, peppers, onions, tomatoes, jalapenos, cucumbers, pickles, guacamole, mushrooms");
            String toppingChoice = scanner.nextLine();
            System.out.println("Added: " + " " + toppingChoice);
            scanner.nextLine();

            if (!toppingChoice.isEmpty()) {
                toppings.addAll(Arrays.asList(toppingChoice.split(", ")));
            }



            System.out.println("Select sauce of choice: \n" +
                    "1) Mayo, 2) Mustard, 3) Ketchup, 4) Ranch, 5) Thousand islands, 6) Vinaigrette");
            int sauceChoice = scanner.nextInt();
            String sauce = "";

            switch (sauceChoice) {
                case 1:
                    sauce = "Mayo";
                    break;
                case 2:
                    sauce = "Mustard";
                    break;
                case 3:
                    sauce = "Ketchup";
                    break;
                case 4:
                    sauce = "Ranch";
                    break;
                case 5:
                    sauce = "Thousand islands";
                    break;
                case 6:
                    sauce = "Vinaigrette";
            }

            System.out.println("Added: " + " " + sauce);

            scanner.nextLine();

            System.out.println("Select side of choice: \n" +
                    "1) Au jus \n" +
                    "2) sauce");

            int sideChoice = scanner.nextInt();
            String side = "";

            switch (sideChoice) {
                case 1:
                    side = "Au jus";
                    break;
                case 2:
                   side = "sauce";
                    break;
            }
            System.out.println("Added: " + side);

            scanner.nextLine();

            System.out.println("Would you like your sandwich toasted? (Yes/No)");
            boolean toasted = scanner.nextLine().equalsIgnoreCase("yes");

            Toppings toppingObj = new Toppings(toppings);

            Sandwich sandwich = new Sandwich(breadType, breadSize, meat, extraMeat, cheese, extraCheese, toppingObj, sauce, side, toasted);
            currentOrder.addItem(sandwich);


                System.out.println("What would you like to do next? \n" +
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
                        Order.checkout();
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

        public static void DrinkMenu () {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Select drink size: \n" +
                    "1) Small - $2.00 \n" + "2) Medium - $2.50 \n" + "3) Large - $3.00");

            int drinkSize = scanner.nextInt();
            String size = "";

            switch (drinkSize) {
                case 1:
                    size = "small";
                    break;
                case 2:
                    size = "medium";
                    break;
                case 3:
                    size = "large";
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    DrinkMenu();
            }

            System.out.println("Select your drink: \n" +
                    "1) Coke, 2) Sprite, 3) Fanta(Orange), 4) Mountain Dew, 5) Dr. Pepper, 6) Root Beer, 7) Diet water");

            int drinkChoice = scanner.nextInt();
            String drinkType = "";

            switch (drinkChoice) {
                case 1:
                    drinkType = "Coke";
                    break;
                case 2:
                    drinkType = "Sprite";
                    break;
                case 3:
                    drinkType = "Fanta(Orange)";
                    break;
                case 4:
                    drinkType = "Mountain Dew";
                    break;
                case 5:
                    drinkType = "Dr. Pepper";
                    break;
                case 6:
                    drinkType = "Root beer";
                    break;
                case 7:
                    drinkType = "Diet water";
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    DrinkMenu();
            }

            Drink drink = new Drink(size, drinkType);
            currentOrder.addItem(drink);

            System.out.println("Added: " + drink);

            System.out.println("What would you like to do next? \n" +
                    "1) Add chips \n" +
                    "2) Checkout \n" +
                    "0) Cancel order");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    ChipsMenu();
                    break;
                case 2:
                    Order.checkout();
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
                    DrinkMenu();
            }
        }

        public static void ChipsMenu () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select Chips: \n " +
                    "1) Doritos (Nacho cheese), 2) Doritos (Cool ranch), 3) Lays (Original), 4) Lays (Sour cream), 5) Lays (Barbeque), 6) Cheetos");
            int chipsChoice = scanner.nextInt();
            String chipsType = "";
            switch (chipsChoice) {
                case 1:
                    chipsType = "Doritos (Nacho cheese)";
                    break;
                case 2:
                    chipsType = "Doritos (Cool ranch)";
                    break;
                case 3:
                    chipsType = "Lays (Original)";
                    break;
                case 4:
                    chipsType = "Lays (Sour cream)";
                    break;
                case 5:
                    chipsType = "Lays (Barbeque)";
                    break;
                case 6:
                    chipsType = "Cheetos";
                    break;
                default:
                    System.out.println("Invalid choice. Please try again");
                    scanner.nextLine();
                    ChipsMenu();
            }

            Chips chips = new Chips(chipsType);
            currentOrder.addItem(chips);

            System.out.println("Added: " + chips);

            System.out.println("What would you like to do next? \n" +
                    "1) Add drink \n" +
                    "2) Checkout \n" +
                    "0) Cancel order");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    DrinkMenu();
                    break;
                case 2:
                    Order.checkout();
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
                    ChipsMenu();
            }
        }
}






