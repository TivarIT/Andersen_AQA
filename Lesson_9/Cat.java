package Lesson_9;

public class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFull;

    public Cat(String name) {
        super(name);
        catCount++;
        this.isFull = false;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " ran " + distance + " meters.");
        } else {
            System.out.println(name + " can't run more than 200 meters.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " can't swim!");
    }

    public void eat(Bowl bowl) {
        if (bowl.decreaseFood(10)) {
            isFull = true;
            System.out.println(name + " ate and is now full.");
        } else {
            System.out.println(name + " couldn't eat because there's not enough food.");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCatCount() {
        return catCount;
    }

    public String getName() {
        return name;
    }
}

