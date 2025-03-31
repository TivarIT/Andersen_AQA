package Lesson_11;

public class ArrayProcessor {
    public static int processArray(String[][] array) throws ArraySizeException, ArrayDataException {
        if (array.length != 4) {
            throw new ArraySizeException();
        }
        for (String[] row : array) {
            if (row.length != 4) {
                throw new ArraySizeException();
            }
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException(i, j, array[i][j]);
                }
            }
        }
        return sum;
    }
}

