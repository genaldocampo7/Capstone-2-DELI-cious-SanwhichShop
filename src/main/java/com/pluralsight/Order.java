package com.pluralsight;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private static List<Orderable> items;
    private static double total;

    public Order() {
        this.items = new ArrayList<>();
        this.total = 0.0;
    }

    public static void addItem(Orderable item) {
        items.add(item);
        total += item.getPrice();
    }


    public static void checkout() {
        System.out.println("\nReceipt:");
        for (Orderable item : items) {
            item.addMessage();
        }
        System.out.println("Total: $" + total);

        saveReceipt();
    }

    public static void saveReceipt() {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
            String fileName = "receipts/" + formatter.format(LocalDateTime.now()) + ".txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            writer.write("Receipt generated on: " + formatter.format(LocalDateTime.now()));
            writer.newLine();



            for (Orderable item : items) {
                item.addMessage();
                writer.newLine();
            }

            writer.write("Total: $" + total);
            writer.close();
            System.out.println("Receipt saved to: " + fileName);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



