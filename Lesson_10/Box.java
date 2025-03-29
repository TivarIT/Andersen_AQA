package Lesson_10;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();

    // Add a fruit to the box
    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    // Get the weight of the box
    public float getWeight() {
        float totalWeight = 0.0f;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    // Compare two boxes by weight
    public boolean compare(Box<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }

    // Transfer fruits to another box
    public void transferFruits(Box<T> anotherBox) {
        if (this == anotherBox) {
            throw new IllegalArgumentException("Can't transfer fruits to the same box!");
        }
        anotherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
