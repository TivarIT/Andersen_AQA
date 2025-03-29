package Lesson_9;

public class Dog extends Animal {
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(name + " ran " + distance + " meters.");
        } else {
            System.out.println(name + " can't run more than 500 meters.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(name + " swam " + distance + " meters.");
        } else {
            System.out.println(name + " can't swim more than 10 meters.");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}

