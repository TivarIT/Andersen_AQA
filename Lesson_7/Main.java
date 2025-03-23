package Lesson_7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1. Checking the sum of two numbers
        System.out.println("Task 1: " + SumChecker.isSumBetween10And20(7, 5));

        // 2. Determining the sign of a number
        System.out.print("Task 2: ");
        NumberSignChecker.checkNumberSign(-5);

        // 3. Checking for a negative number
        System.out.println("Task 3: " + NegativeNumberChecker.isNegative(-3));

        // 4. Line output n times
        System.out.println("Task 4:");
        StringRepeater.repeatString("Hello", 3);

        // 5. Checking the leap year
        System.out.println("Task 5: " + LeapYearChecker.isLeapYear(2024));

        // 6. Inversion of an array
        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        ArrayInverter.invertArray(binaryArray);
        System.out.println("Task 6: " + Arrays.toString(binaryArray));

        // 7. Filling an array with numbers 1-100
        int[] filledArray = ArrayFiller.fillArray(100);
        System.out.println("Task 7: " + Arrays.toString(filledArray));

        // 8. Multiplication of array elements < 6 by 2
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        SmallNumberMultiplier.multiplySmallNumbers(numbers);
        System.out.println("Task 8: " + Arrays.toString(numbers));

        // 9. Filling in the diagonal of a two-dimensional array
        int[][] matrix = DiagonalFiller.fillDiagonal(5);
        System.out.println("Task 9:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        // 10. Creating an array with the specified parameters
        int[] customArray = CustomArrayCreator.createArray(5, 7);
        System.out.println("Task 10: " + Arrays.toString(customArray));

        // 11. Cyclic shifting of an array
        int[] shiftArray = {3, 5, 6, 1};
        ArrayShifter.shiftArray(shiftArray, -2);
        System.out.println("Task 11: " + Arrays.toString(shiftArray));
    }
}
