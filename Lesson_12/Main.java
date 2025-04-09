package Lesson_12;

public class Main {
    private static final String FILE_NAME = "Lesson_12/data.csv";

    public static void main(String[] args) {
        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {
                {100, 200, 123},
                {300, 400, 500}
        };

        AppData appData = new AppData(header, data);

        CSVHandler.saveToCSV(FILE_NAME, appData);
        System.out.println("Data saved to " + FILE_NAME);

        AppData loadedData = CSVHandler.loadFromCSV(FILE_NAME);
        System.out.println("Loaded data:\n" + loadedData);
    }
}

