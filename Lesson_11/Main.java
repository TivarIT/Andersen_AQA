package Lesson_11;

public class Main {
    public static void main(String[] args) {
        // Valid 4x4 array
        String[][] validArray = {
                {"4", "2", "0", "5"},
                {"5", "1", "4", "13"},
                {"7", "5", "2", "10"},
                {"9", "7", "15", "8"}
        };

        // Invalid size array (3x4)
        String[][] invalidSizeArray = {
                {"9", "3", "4", "10"},
                {"14", "7", "1", "2"},
                {"8", "14", "0", "4"}
        };

        // Array with incorrect data
        String[][] invalidDataArray = {
                {"5", "2", "1", "3"},
                {"2", "4", "0", "5"},
                {"7", "E", "8", "7"},
                {"11", "9", "10", "4"}
        };

        try {
            System.out.println("Sum: " + ArrayProcessor.processArray(validArray));
        } catch (ArraySizeException | ArrayDataException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Sum: " + ArrayProcessor.processArray(invalidSizeArray));
        } catch (ArraySizeException | ArrayDataException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Sum: " + ArrayProcessor.processArray(invalidDataArray));
        } catch (ArraySizeException | ArrayDataException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

