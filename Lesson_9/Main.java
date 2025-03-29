package Lesson_9;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex");
        Dog dog2 = new Dog("Muhtar");
        Cat cat1 = new Cat("Snezhok");
        Cat cat2 = new Cat("Meowka");

        dog1.run(300);
        dog2.swim(8);
        cat1.run(150);
        cat2.swim(5);

        System.out.println("\nTotal Animals: " + Animal.getAnimalCount());
        System.out.println("Total Dogs: " + Dog.getDogCount());
        System.out.println("Total Cats: " + Cat.getCatCount());

        // Create a bowl and add the food
        Bowl bowl = new Bowl(20);
        Cat[] cats = {new Cat("Tom"), new Cat("Zhirnich"), new Cat("Luna")};

        // Feed all the cats
        for (Cat cat : cats) {
            cat.eat(bowl);
        }

        // Displaying the status of cats
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " is full: " + cat.isFull());
        }

        // Adding food
        bowl.addFood(15);
        System.out.println("Food in the bowl: " + bowl.getFoodAmount());

        // Creating a payment
        Payment payment = new Payment();
        payment.addItem("Laptop", 1000);
        payment.addItem("Mouse", 50);
        payment.showItems();

        // Information about the park
        Park park = new Park("Sunny Park");
        park.addAttraction("Ferris Wheel", "10:00 - 22:00", 5);
        park.addAttraction("Roller Coaster", "12:00 - 20:00", 10);
        park.showAttractions();
    }
}
