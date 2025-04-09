package Lesson_12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVHandler {
    private static final String DELIMITER = ";";

    public static void saveToCSV(String filename, AppData data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(String.join(DELIMITER, data.getHeader()));
            writer.newLine();

            for (int[] row : data.getData()) {
                StringBuilder line = new StringBuilder();
                for (int value : row) {
                    line.append(value).append(DELIMITER);
                }
                writer.write(line.substring(0, line.length() - 1));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static AppData loadFromCSV(String filename) {
        List<int[]> dataList = new ArrayList<>();
        String[] header;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            header = reader.readLine().split(DELIMITER);

            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(DELIMITER);
                int[] row = new int[values.length];

                for (int i = 0; i < values.length; i++) {
                    row[i] = Integer.parseInt(values[i]);
                }
                dataList.add(row);
            }

            int[][] dataArray = dataList.toArray(new int[0][]);
            return new AppData(header, dataArray);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            return null;
        }
    }
}
