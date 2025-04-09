package Lesson_13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueWords {
    public static void main(String[] args) {
        String[] words = {
                "banana", "banana", "system", "terracotta", "banana", "terracotta",
                "down", "pie", "terracotta", "pie", "hey", "terracotta",
                "pie", "hey", "system", "of", "a", "down "
        };

        Set<String> uniqueWords = new HashSet<>();
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            uniqueWords.add(word);
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Unique words: " + uniqueWords);
        System.out.println("Word frequencies: " + wordCount);
    }
}
