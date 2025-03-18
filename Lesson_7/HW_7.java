package Lesson_7;

import java.util.Arrays;

public class HW_7 {
    public static void main(String[] args) {
        // 1. Checking the sum of two numbers
        System.out.println("Task 1: " + isSumBetween10And20(7, 5));

        // 2. Determining the sign of a number
        System.out.print("Task 2: ");
        checkNumberSign(-5);

        // 3. Checking for a negative number
        System.out.println("Task 3: " + isNegative(-3));

        // 4. Line output n times
        System.out.println("Task 4:");
        repeatString("Hello", 3);

        // 4*. Checking the leap year
        System.out.println("Task 4*: " + isLeapYear(2024));

        // 5. Inverting an array
        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArray(binaryArray);
        System.out.println("Task 5: " + Arrays.toString(binaryArray));

        // 6. Filling the array with 1-100
        int[] filledArray = new int[100];
        fillArray(filledArray);
        System.out.println("Task 6: " + Arrays.toString(filledArray));

        // 7. Doubling of array elements < 6
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplySmallNumbers(numbers);
        System.out.println("Task 7: " + Arrays.toString(numbers));

        // 8. Заполнение диагонали двумерного массива
        int[][] matrix = fillDiagonal(5);
        System.out.println("Task 8:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        // 9*. Filling in the diagonal of a two-dimensional array
        int[] customArray = createArray(5, 7);
        System.out.println("Task 9*: " + Arrays.toString(customArray));

        // 9***. Cyclic shifting of an array
        int[] shiftArray = {3, 5, 6, 1};
        shiftArray(shiftArray, -2);
        System.out.println("Task 9***: " + Arrays.toString(shiftArray));
    }

    public static boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void checkNumberSign(int number) {
        System.out.println(number >= 0 ? "Positive" : "Negative");
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void repeatString(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void invertArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    public static void multiplySmallNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    public static int[][] fillDiagonal(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[i][size - 1 - i] = 1;
        }
        return matrix;
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }

    public static void shiftArray(int[] array, int n) {
        int length = array.length;
        n = n % length;
        if (n < 0) {
            n += length;
        }
        for (int i = 0; i < n; i++) {
            int last = array[length - 1];
            for (int j = length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = last;
        }
    }
}
