package com.yaroslav;

import java.util.HashMap;
import java.util.Locale;

public class WordCounter {
    public static HashMap<String, Integer> countWords(String text, boolean ignoreCase) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] words = text.split("\\W+");

        for (var word : words) {
            var usageCount = 1;

            if (ignoreCase)
                word = word.toLowerCase(Locale.ROOT);

            // This word is already known, so get
            // and increase it's usage count:
            if (map.containsKey(word))
                usageCount = map.get(word) + 1;

            map.put(word, usageCount);
        }

        return map;
    }
}
