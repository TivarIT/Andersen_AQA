package Lesson_10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Swap elements in an array
        String[] words = {"Apple", "Banana", "Pear"};
        System.out.println("Before Swap: " + Arrays.toString(words));
        swapElements(words, 0, 2);
        System.out.println("After Swap: " + Arrays.toString(words));

        // Creating fruit boxes
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Apple> anotherAppleBox = new Box<>();

        // Adding fruits
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println("\nApple Box Weight: " + appleBox.getWeight());
        System.out.println("Orange Box Weight: " + orangeBox.getWeight());

        // Comparing boxes
        System.out.println("\nAre Apple Box and Orange Box equal in weight? " + appleBox.compare(orangeBox));

        // Transferring apples
        System.out.println("\nTransferring apples to another apple box...");
        appleBox.transferFruits(anotherAppleBox);
        System.out.println("Apple Box Weight after transfer: " + appleBox.getWeight());
        System.out.println("Another Apple Box Weight: " + anotherAppleBox.getWeight());
    }

    // Generic method to swap elements in an array
    public static <T> void swapElements(T[] array, int index1, int index2) {
        if (index1 >= 0 && index1 < array.length && index2 >= 0 && index2 < array.length) {
            T temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        } else {
            throw new IndexOutOfBoundsException("Invalid indices for swap!");
        }
    }
}

