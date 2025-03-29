package Lesson_9;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private String name;
    private List<Attraction> attractions = new ArrayList<>();

    public Park(String name) {
        this.name = name;
    }

    public void addAttraction(String name, String hours, int cost) {
        attractions.add(new Attraction(name, hours, cost));
    }

    public void showAttractions() {
        System.out.println("Attractions in " + this.name + ":");
        for (Attraction attraction : attractions) {
            System.out.println(attraction.name + " - Open: " + attraction.hours + " - Cost: $" + attraction.cost);
        }
    }

    private static class Attraction {
        String name;
        String hours;
        int cost;

        Attraction(String name, String hours, int cost) {
            this.name = name;
            this.hours = hours;
            this.cost = cost;
        }
    }
}

