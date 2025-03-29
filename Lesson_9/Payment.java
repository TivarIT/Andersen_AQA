package Lesson_9;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private List<Item> items = new ArrayList<>();

    public void addItem(String name, double price) {
        items.add(new Item(name, price));
    }

    public void showItems() {
        System.out.println("Purchased items:");
        for (Item item : items) {
            System.out.println(item.name + " - $" + item.price);
        }
    }

    private static class Item {
        String name;
        double price;

        Item(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }
}

