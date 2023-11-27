package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> words = new HashMap<String, Integer>();

        if (sentence.isEmpty()) {
            return words;
        }

        for (var word : sentence.split("\\s+")) {
            var wordCount = words.getOrDefault(word, 0) + 1;
            words.put(word, wordCount);
        }

        return words;
    }

    public static String toString(Map<String, Integer> words) {
        if (words.isEmpty()) {
            return "{}";
        }

        var result = "{";

        for (var word : words.entrySet()) {
            result += "\n  " + word.getKey() + ": " + word.getValue();
        }

        result += "\n}";
        
        return result;
    }
}
//END
