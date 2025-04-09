package Lesson_13;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== Unique Words Task ====");
        UniqueWords.main(null);

        System.out.println("\n==== Phone Directory Task ====");
        PhoneDirectory directory = new PhoneDirectory();

        directory.add("Smith", "123-456-789");
        directory.add("Johnson", "987-654-321");
        directory.add("Smith", "333-222-111");
        directory.add("Unknown", "778-815-233");
        directory.add("Brown", "880-055-353");
        directory.add("Smith", "999-555-333");

        System.out.println("Smith's numbers: " + directory.get("Smith"));
        System.out.println("Johnson's numbers: " + directory.get("Johnson"));
        System.out.println("Brown's numbers: " + directory.get("Brown"));
        System.out.println("Unknown's numbers: " + directory.get("Unknown"));
    }
}

