package Lesson_7;

import java.util.Arrays;

public class CustomArrayCreator {
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }
}
