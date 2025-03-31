package Lesson_11;

public class ArrayDataException extends Exception {
    public ArrayDataException(int row, int col, String value) {
        super("Invalid data at [" + row + "][" + col + "]: '" + value + "' isn't a valid number!");
    }
}

