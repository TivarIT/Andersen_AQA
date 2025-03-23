package Lesson_7;

public class ArrayShifter {
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
